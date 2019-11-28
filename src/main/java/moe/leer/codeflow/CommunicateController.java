package moe.leer.codeflow;

import moe.leer.codeflow.core.CodeFlowCompiler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author leer
 * Created at 11/28/19 3:51 PM
 */
@Controller
public class CommunicateController {
  /**
   * @param code input code fragment
   * @return the ast tree message
   */
  @MessageMapping("/communicate")
  @SendTo("/topic/ast")
  public ASTMessage communicate(String code) {
    ASTMessage message = new CodeFlowCompiler().parse(code);
    System.out.println(message);
    return message;
  }
}
