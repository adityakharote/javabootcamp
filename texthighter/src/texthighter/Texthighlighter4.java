package texthighter;

import java.util.*;

public class Texthighlighter4
{
	public static void main(String args[])
	{
		String inputtext = "if we write a program and compile it, then as we run the program, we will get output";
	    ArrayList<Keyword> al = new ArrayList<Keyword>();
	    al.add(new Keyword("as" , "blue" , "capital" , "normal"));
	    al.add(new Keyword("if" , "red" , "lower" , "bold"));
	    al.add(new Keyword("and" , "red" , "capital" , "bold"));
	    al.add(new Keyword("then" , "green" , "lower" , "normal"));
	    al.add(new Keyword("when" , "blue" , "lower" , "normal"));
	    
	    
	    System.out.println(KeyWordHighlighter.keyWordHighlighter(inputtext, al));
	
	}
}