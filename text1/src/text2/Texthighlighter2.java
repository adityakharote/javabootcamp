package text2;

import java.util.*;

public class Texthighlighter2 {

	public static void main(String[] args) {
		HashMap<String, String> keycolor = new HashMap<String, String>();
		keycolor.put("as", "blue");
		keycolor.put("if", "red");
		keycolor.put("and", "red");
		keycolor.put("then", "green");
		keycolor.put("when", "blue");
		
		String inputtext = "If we write a program and compile it, then as we run the program, we will get output";
		
		Keywordhighlighter keyword = new Keywordhighlighter();
		System.out.println(keyword.keywordhighlighter(inputtext, keycolor));
		
	}
}
