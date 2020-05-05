package moe.leer.codeflow;

import lombok.Data;

/**
 * @author leer
 * Created at 4/29/20 10:35 PM
 */
@Data
public class Result<T, E extends String> {
  T data;
  String error;

  public Result() {
  }

  public Result(T data) {
    this.data = data;
  }

  public Result(String error) {
    this.error = error;
  }
}
