import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java_cup.runtime.Symbol;

public class QC {
	private static Yylex lex;
	private static parser pccParser;
	private static InputStream input = System.in;

	public static void main(String[] args) {
		try {
			input = new FileInputStream("Test_files/"+args[0]);
			lex = new Yylex(input);
			pccParser = new parser(lex);
			pccParser.parse();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}
	}
}
