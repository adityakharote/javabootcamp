package text1;

public class Keywordhighlighter {
	public String keywordHighlighter ( String keyline, String keywordSet)
	{
	String[] keylineArr = keyline.split("\\s");
	String[] keywordSetArr = keywordSet.split("\\s");
	for (int i = 0; i < keywordSetArr.length; i++) {
		
		for (int j = 0; j < keylineArr.length; j++) {
			
			if (keywordSetArr[i].equalsIgnoreCase(keylineArr[j])) {
				
				keywordSet = keywordSet.replaceAll(keywordSetArr[i], "[blue]" + keywordSetArr[i] + "[blue]");
				
			}
			
		}

	}
      return keywordSet;

}
}

	
