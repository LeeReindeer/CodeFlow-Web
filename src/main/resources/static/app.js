const debounce = (func, delay) => {
    let debounceTimer
    return function () {
        const context = this
        const args = arguments
        clearTimeout(debounceTimer)
        debounceTimer
            = setTimeout(() => func.apply(context, args), delay)
    }
}

let editor;
let viz = new Viz();

function update() {
    const graphPane = $("#graph-pane");
    graphPane.css('opacity', '0.4');
    console.log("sendCode");
    sendCode();
}

// Integrating ANTLR JavaScript parsers with ACE editor
//https://www.zybuluo.com/3013216027/note/346407
function onLoad() {
    ace.require("ace/ext/language_tools");
    editor = ace.edit("editor");
    editor.getSession().setMode("ace/mode/java");
    editor.setFontSize("18px");
    editor.setTheme("ace/theme/github");
    editor.setOptions({
        enableBasicAutocompletion: true,
        enableSnippets: true
    });
    editor.setShowPrintMargin(false);
    editor.setHighlightActiveLine(false);
    editor.getSession().on('change', debounce(update, 1000));

    var socket = new SockJS('/codeflow-ws');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log("Connected: " + frame);
        stompClient.subscribe("/topic/flowchart", function (astMsg) {
            showResult(JSON.parse(astMsg.body));
        });
    });
}

function onClose() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    console.log("disconnected");
}

function sendCode() {
    console.log(editor.getValue());
    if (editor.getValue() !== "") {
        stompClient.send("/app/flowchart", {}, editor.getValue());
    }
}

function showResult(json) {
    $("#tokens").html("");
    console.log("show result: " + json);

    if (json.data != null && json.data != "") {
        $("#resultPane").last().html("");
        viz.renderImageElement(json.data)
            .then(function (element) {
                $("#graphImage").html(element)
                let image = $("#graphImage :last-child")
                image.addClass("img-fluid")
                image.css('height', '100%')
                image.css('width', '100%')

                $("#graph-pane").css('opacity', '1');
                console.log("element: " + element);
            })
            .catch(error => {
                $("#resultPane").last().html("<strong>" + error + "</strong>");
                viz = new Viz();
            });
    } else {
        $("#resultPane").last().html("<strong>" + json.error + "</strong>");
        $("#graphImage").html("")
    }
}