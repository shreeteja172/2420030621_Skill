package MyProject;

public class stringexample {
  public static void main(String[] args) {
    String str=("Hello this is java class");
    String str1="Hello";
    String str2="HeLLo";
    String str3="hi how are you";
    String str4="hello";
    String str5="1234";
    String str6="Java234";
    String str8="   Hello Java   ";
    String str7="";
    System.out.println(str.length());
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.charAt(7));
    System.out.println(str1.compareTo(str2));
    System.out.println(str1.compareTo(str4));
    System.out.println(str1.compareToIgnoreCase(str2));
    System.out.println(str1.concat(str3));
    System.out.println(str1.contains("hel"));
    System.out.println(str1.contentEquals(str4));
    System.out.println(str1.endsWith("lo"));
    System.out.println(str1.equals(str3));
    System.out.println(str1.indexOf('1'));
    System.out.println(str1.matches("[a-zA-Z]+"));
    System.out.println(str5.matches("\\d+"));
    System.out.println(str6.isEmpty());
    System.out.println(String.join("|",str2,str3,str4));
    System.out.println(String.join(":","hello","h1","how","are"));
    System.out.println(str1.lastIndexOf('l'));
    System.out.println(str1.replace("llo","pa"));
    System.out.println(str1.replaceFirst("ell","tr"));
      String str10="hi;how;are;you";
    String str8[]=str10.split(",");
    for (String i:str8) {
      System.out.println(i);
    }
    //above is foreach loop
    System.out.println(str8[0]);
    System.out.println(str8[1]);
    
    System.out.println(str6.startsWith("J"));
        System.out.println(str.subSequence(5, 13));    
    
  } 
}