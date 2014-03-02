import java.io.*;

public class TestScanner {

    public static void main (String[] args) throws IOException {
	
	Yylex myscanner = new Yylex(System.in);
	Yytoken nextToken = myscanner.yylex();

	while (nextToken != null) {
	    System.out.print(nextToken.getToken());

	    if (nextToken.getToken().equals("NUM"))
		System.out.print("(" + nextToken.getValue()+")  ");
	    else {
		if (nextToken.getToken().equals("ID"))
			System.out.print("(" + nextToken.getName()+")  ");
		else
			System.out.print(" ");
	    }
	    nextToken = myscanner.yylex();
	}


    }

}