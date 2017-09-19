package text3;

import java.util.*;

public class Texthighlighter3 {
	public static void main(String[] args) {
		HashMap<String, String> colorAndCase = new HashMap<String, String>();
		colorAndCase.put("as", "blue:capital");
		colorAndCase.put("if", "red:lower");
		colorAndCase.put("and", "red:capital");
		colorAndCase.put("then", "green:lower");
		colorAndCase.put("when", "blue:lower");
		
		String input = "If we write a program and compile it, then as we run the program, we will get output";
		Keywordhighlighter keyword = new Keywordhighlighter();
		System.out.println(keyword.keyWordHighlighter(input, colorAndCase));
		
		
}
}
