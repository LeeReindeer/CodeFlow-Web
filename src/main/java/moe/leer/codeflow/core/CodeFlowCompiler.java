package moe.leer.codeflow.core;

import moe.leer.codeflow.ASTMessage;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leer
 * Created at 11/28/19 1:20 PM
 */
public class CodeFlowCompiler {


  /**
   * Parse code to token stream and AST
   *
   * @param code
   * @return
   */
  public ASTMessage parse(String code) {
    ASTMessage message = new ASTMessage();

    CodeFlowLexer lexer = new CodeFlowLexer(CharStreams.fromString(code));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);

    tokenStream.getNumberOfOnChannelTokens();

    message.setTokens(tokenStream.getTokens().stream().map(new Function<Token, String>() {
      @Override
      public String apply(Token token) {
        return token.toString();
      }
    }).collect(Collectors.toList()));

    CodeFlowParser parser = new CodeFlowParser(tokenStream);
    ParseTree ast = parser.toplevelStatement();
    message.setAst(ast.toStringTree(parser));
    return message;
  }

  public static void main(String[] args) {
    String script =
        "for(int i = 0; i < 2;i++) {" +
            "   a++" +
            "}";
    CodeFlowLexer lexer = new CodeFlowLexer(CharStreams.fromString(script));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    System.out.println(tokenStream.getNumberOfOnChannelTokens());
    for (Token token : tokenStream.getTokens()) {
      System.out.println(token);
    }

    CodeFlowParser parser = new CodeFlowParser(tokenStream);
    ParseTree ast = parser.toplevelStatement();
    System.out.println(ast.toStringTree(parser));
  }
}
