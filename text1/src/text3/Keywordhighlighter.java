package text3;

import java.util.HashMap;
import java.util.Iterator;

public class Keywordhighlighter {
	public  String keyWordHighlighter(String input, HashMap<String, String> colorAndCase )
	{
	String inputarr[] = input.split("\\s");
	Iterator<String> iterator = colorAndCase.keySet().iterator();
	while (iterator.hasNext()) {
		String key = (String) iterator.next();
		String value = (String) colorAndCase.get(key);
		for (int i = 0; i < inputarr.length; i++) {
			if (key.equalsIgnoreCase(inputarr[i])) {
				String valuearr[] = value.split(":");
				if (valuearr[1].equals("capital"))
				{
                  String upper = inputarr[i].toUpperCase();						
				input = input.replaceAll(inputarr[i], "[" +valuearr[0]+ "]"+ upper + "[" + valuearr[0] + "]");
			    }
				else
				{
					input = input.replaceAll(inputarr[i], "["+valuearr[0] +"]"+ inputarr[i] +"["+ valuearr[0] +"]");
				}
			
		}

	}
	
}
	return input;
}
}
