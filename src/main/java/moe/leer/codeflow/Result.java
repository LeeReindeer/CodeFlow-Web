package moe.leer.codeflow;

import lombok.Data;

/**
 * Present a result contains data or error
 *
 * @author leer
 * Created at 4/29/20 10:35 PM
 */
@Data
public class Result<T, E extends String> {
  T data;
  E error;

  public Result() {
  }

  public Result(T data) {
    this.data = data;
  }

  public Result(E error) {
    this.error = error;
  }
}
