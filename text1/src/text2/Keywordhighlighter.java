package text2;

import java.util.HashMap;
import java.util.Iterator;

public class Keywordhighlighter {
	
	public static String keywordhighlighter(String input ,HashMap<String , String> color)
	{
	String inputarr[] = input.split("\\s");
	Iterator<String> iterator = color.keySet().iterator();
	while (iterator.hasNext()) {
		String key = (String) iterator.next();
		String value = (String) color.get(key);
		for (int i = 0; i < inputarr.length; i++) {
			if (key.equalsIgnoreCase(inputarr[i])) {
				input = input.replaceAll(inputarr[i], "["+value +"]"+ inputarr[i] +"["+ value +"]");
			}
			// System.out.println(key + " " + value);
		}

	}
	return input;

}
}