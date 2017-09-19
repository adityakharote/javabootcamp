package texthighter;

import java.util.ArrayList;

public class KeyWordHighlighter {
 public static String keyWordHighlighter(String inputText, ArrayList<Keyword> keywordList) {
  for (Keyword keyword : keywordList) {
   String key = keyword.getKey();
   String color = keyword.getColor();
   String capitalisation = keyword.getCapitalisation();
   String bon = keyword.getBon();  
   if ((capitalisation.equals("lower")) && (bon.equals("normal")) )
   {
	    inputText = inputText.replaceAll(key, "[" + color + "]" +key.toLowerCase() +"[" + color + "]");
   }
   
   else if((capitalisation.equals("lower")) && (bon.equals("bold")))
   {
	   inputText = inputText.replaceAll(key, "[" + color + "]" +"[" +bon + "]"+ key.toLowerCase() +"[" +bon + "]"+ "[" + color + "]");
   }
   
   else if((capitalisation.equals("capital")) && (bon.equals("normal")))
   {
	   inputText = inputText.replaceAll(key, "[" + color + "]" +key.toUpperCase() +"[" + color + "]");
   }
   else if ((capitalisation.equals("capital")) && (bon.equals("bold")))
   {
	   inputText = inputText.replaceAll(key, "[" + color + "]" +"[" +bon + "]"+ key.toUpperCase() +"[" +bon + "]"+ "[" + color + "]");
   }
  

  
 }
  return inputText;
}
 }