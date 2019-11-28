package moe.leer.codeflow;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leer
 * Created at 11/28/19 5:24 PM
 */
@Data
public class ASTMessage {
  private List<String> tokens = new ArrayList<>();

  private String ast;

}
