public class String4 {
  public static void countWords(String s){
    StringBuilder sb=new StringBuilder();
    int cnt=0;
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch!=' '){
        sb.append(ch);
      }
      else{
        cnt++;
        sb.setLength(0);
      }
    }
    if(sb.length()>0){
      cnt++;
    }
    System.out.println("Total no of words:"+cnt);
  }
  public static void longestWord(String s){
    StringBuilder sb=new StringBuilder();
    int maxLength=0;
    String longest="";
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch!=' '){
        sb.append(ch);
      }
      else{
        if(sb.length()>maxLength){
          maxLength=sb.length();
          longest=sb.toString();
        }
        sb.setLength(0);
      }
    }
    if(sb.length()>maxLength){
      maxLength=sb.length();
      longest=sb.toString();
    }
    System.out.println("The longest word is:"+longest);
  }
  public static void countOccuranceOfCharacter(String s,char found){
    int count=0;
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch==found){
        count++;
      }
    }
    System.out.println("Character "+found+" appears "+count+" times");
  }
  public static void findAllSubstrings(String s){
    System.out.println("Finding All Substrings:");
    for(int i=0;i<=s.length();i++){
      for(int j=i+1;j<=s.length();j++){
        System.out.println(s.substring(i, j));
      }
    }
  }
  public static void main(String[] args){
    String s="Einstein College Of Engineering";
    countWords(s);
    longestWord(s);
    countOccuranceOfCharacter(s,'i');
    findAllSubstrings("Hello");
  }
}
