import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class TextHighlighter {
	private List<String> tokenizeInput(String inputText) {
		List<String> tokenizedString = new ArrayList<String>();

		StringTokenizer st = new StringTokenizer(inputText, " ");
		while (st.hasMoreTokens()) {
			tokenizedString.add(st.nextToken());
		}
		return tokenizedString;
	}

	public String highlightText(String inputText, List<String> keywords,
			String colour) {
		List<String> tokenisedInput = tokenizeInput(inputText);
		String outputString = new String();
		Iterator<String> inputIterator = tokenisedInput.iterator();
		while (inputIterator.hasNext()) {
			String currentInput = inputIterator.next();
			boolean match = false;
			Iterator<String> keywordIterator = keywords.iterator();
			while (keywordIterator.hasNext()) {
				if (currentInput.equalsIgnoreCase(keywordIterator.next())) {
					match = true;
					break;
				}
			}
			if (match) {
				outputString += " [" + colour + "]" + currentInput + "["
						+ colour + "]";
			} else {
				outputString += " " + currentInput;
			}
		}
		return outputString;
	}
}
