var editor;
$.getScript('//cdnjs.cloudflare.com/ajax/libs/ace/1.1.3/ace.js', function () {
    $.getScript('//cdnjs.cloudflare.com/ajax/libs/ace/1.1.3/ext-language_tools.js', function () {
        ace.require("ace/ext/language_tools");
        editor = ace.edit("editor");
        editor.getSession().setMode("ace/mode/java");
        editor.setTheme("ace/theme/github");
        editor.setOptions({
            enableBasicAutocompletion: true,
            enableSnippets: true
        });
        editor.setShowPrintMargin(false);
        editor.setHighlightActiveLine(false);
    });
});

// Integrating ANTLR JavaScript parsers with ACE editor
//https://www.zybuluo.com/3013216027/note/346407
function connect() {
    var socket = new SockJS('/codeflow-ws');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log("Connected: " + frame);
        stompClient.subscribe("/topic/ast", function (astMsg) {
            showResult(JSON.parse(astMsg.body));
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    console.log("disconnected");
}

function sendCode() {
    console.log(editor.getValue());
    stompClient.send("/app/communicate", {}, editor.getValue());
}

function showResult(json) {
    $("#tokens").html("");
    console.log("show result: " + json);
    json.tokens.forEach(function (t) {
        // console.log(t);
        $("#tokens").append("<tr><td>" + t + "</td></tr>");
    });

    $("#resultPane").last().html("<strong>" + json.ast + "</strong>");
}