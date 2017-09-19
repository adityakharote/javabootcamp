package javabootprograms;

import java.awt.List;

public class Program1
{
	public static void main(String[] args)


{ 
	
	String inputText = "If we write a program and compile it, then we can run the program to get output"; 

	List keywords = new ArrayList(Arrays.asList("as", "if", "and", "then", "when")); 


	String colour = "blue";  

	TextHighlighter textHighlighter = new TextHighlighter();

	String outputText = textHighlighter.highlightText(inputText, keywords,    colour); 

	System.out.println(outputText);

}
}