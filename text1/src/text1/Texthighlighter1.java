package text1;

import java.util.*;

public class Texthighlighter1 {

	public static void main(String[] args) {

		//boolean flag = false;
		String keyline = "as if and then when ";
		String keywordSet = "If we write a program and compile it, then we can run the program to get output ";
		Keywordhighlighter keyword = new Keywordhighlighter();
		System.out.println(keyword.keywordHighlighter(keyline, keywordSet));
		

	}
}
