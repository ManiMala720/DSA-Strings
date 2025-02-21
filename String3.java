public class String3 {
  /* Using StringBuilder
  1)Print Words in a sentence
  2)Print first 2 characters in each word of a sentence
  3)Print words start with a given character */
  public static void printWords(String s){
    System.out.println("Words in a sentence");
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch!=' '){
        sb.append(ch);
      }
      else{
        if(sb.length()>0){
         System.out.println(sb.toString());
         sb.setLength(0);
        }
      }
    }
    if(sb.length()>0){
      System.out.println(sb.toString());
    }
  }
  public static void printFirstTwoCharacters(String s){
    System.out.println("Print first 2 characters in each words:");
    StringBuilder sr=new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch!=' '){
        sr.append(ch);
      }
      else{
        if(sr.length()>0){
          System.out.println(sr.substring(0,Math.min(2,sr.length())));
          sr.setLength(0);
        }
      }
    }
    if(sr.length()>0){
      System.out.println(sr.substring(0,Math.min(2,sr.length())));
    }
  }
  public static void printWordsStartWith(String s,char start){
    System.out.println("Print the words starts with "+start+" :");
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch!=' '){
        sb.append(ch);
      }
      else{
        if(sb.length()>0 && sb.charAt(0)==start){
          System.out.println(sb.toString());
        }
        sb.setLength(0);
      }
    }
    if(sb.length()>0 && sb.charAt(0)==start){
      System.out.println(sb.toString());
    }
  }
  
  public static void main(String[] args){
    String s="Einstein College Of Engineering";
    printWords(s);
    printFirstTwoCharacters(s);
    printWordsStartWith(s,'E');
    
  }

}
