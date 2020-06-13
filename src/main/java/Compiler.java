import compiler.ValueVisitor;
import grammar.LanguageLexer;
import grammar.LanguageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


public class Compiler {
    private static String TEST_FILE = "src/main/resources/test.avaj";

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName(TEST_FILE);
        LanguageLexer languageLexer = new LanguageLexer(charStream);
        LanguageParser languageParser = new LanguageParser(new CommonTokenStream(languageLexer));
        ParseTree parseTree = languageParser.parse();
        ValueVisitor visitor = new ValueVisitor();
        visitor.visit(parseTree);
    }
}
