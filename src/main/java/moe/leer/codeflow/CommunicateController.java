package moe.leer.codeflow;

import guru.nidi.graphviz.engine.Format;
import moe.leer.codeflowcore.CodeFlow;
import moe.leer.codeflowcore.FlowchartConfig;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author leer
 * Created at 11/28/19 3:51 PM
 */
@Controller
public class CommunicateController {

  private static final CodeFlow codeFlow = CodeFlow.builder()
      .failFast(true)
      .strictMode(false)
      .useNative(true)
      .workDir("examples")
      .outDir("tests")
      .format(Format.PNG)
      .build();

  static {
    FlowchartConfig.setFunctionColor("pink");
    FlowchartConfig.virtualStartNode = true;
    FlowchartConfig.virtualEndNode = true;
    FlowchartConfig.mergeSequences = true;
  }

  /**
   * @param code the source code
   * @return the DOT language of flowchart
   */
  @MessageMapping("/flowchart")
  @SendTo("/topic/flowchart")
  public Result<String, String> flowchartDOT(String code) {
    Result<String, String> result = new Result<>();
    try {
      result.data = codeFlow.parse(code).toDOT();
    } catch (Exception e) {
      result.data = "";
      result.error = e.getCause().getMessage();
    }
    System.out.println(result);
    return result;
  }


}
