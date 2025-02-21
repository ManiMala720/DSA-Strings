public class String2 {
  public static void removeDuplicate(String s){
   boolean found[]=new boolean[256];
   StringBuilder sb=new StringBuilder();
   for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(!found[c]){
      sb.append(c);
      found[c]=true;
    }
   }
   System.out.println("After removing duplicates:"+sb.toString());
  }
  public static void convertToUpperCase(String s){
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if(ch>='a' && ch<='z'){
        sb.append((char)(ch-'a'+'A'));
      }
    }
    System.out.println("After converting into uppercase:"+sb.toString());
  }
  public static void reverseCase(String t){
    for(int i=0;i<t.length();i++){
      char ch=t.charAt(i);
      if(ch>='a' && ch<='z'){
        System.out.print((char)(ch-'a'+'A'));
      }
      else if(ch>='A' && ch<='Z'){
        System.out.print((char)(ch-'A'+'a'));
      }
      else{
        System.out.print(ch);
      }
    }
  }
  public static void main(String[] args){
    String str1="madam";
    removeDuplicate(str1);
    convertToUpperCase(str1);
    reverseCase("Hello World!");
  }
}
