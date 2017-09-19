package texthighter;

public class Keyword {
 private String key,color, capitalisation, bon;


 public Keyword(String key, String color, String capitalisation, String bon) {
  this.key = key;
  this.color = color;
  this.capitalisation = capitalisation;
  this.bon = bon ;  // bon stands for bold or normal
 }

 public String getKey() {
  return key;
 }

 public String getColor() {
  return color;
 }

 public String getCapitalisation() {
  return capitalisation;
 }
 
 public String getBon() {
	  return bon;
	 }
}