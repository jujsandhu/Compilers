
public class Test {
	public static void main(String args[]) throws Exception {

		Yylex scanner = new Yylex(System.in);
		parser parser = new parser(scanner);
	  	parser.parse();
	    }
}