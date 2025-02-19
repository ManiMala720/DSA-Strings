public class String1 {
  public static String reverseString(String s){
    char[] ch=s.toCharArray();
    int lt=0;
    int rt=s.length()-1;
    while(lt<rt){
      char temp=ch[lt];
      ch[lt]=ch[rt];
      ch[rt]=temp;
      lt++;
      rt--;
    }
   return new String(ch);
    
  }
  public static boolean isPalindrome(String s1){
    int lt=0;
    int rt=s1.length()-1;
    while(lt<rt){
      if(s1.charAt(lt)==s1.charAt(rt)){
        lt++;
        rt--;
      }
      else{
        return false;
      }
    }
    return true;
  }
  public static void countVowelsConsonants(String str){
    int vowelCount=0;
    int consonantCount=0;
    str=str.toLowerCase();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
     if(ch>='a' && ch<='z')  {
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        vowelCount++;
      }
      else{
        consonantCount++;
      }
     }
    }
    System.out.println("Vowel count is:"+vowelCount);
    System.out.println("Consonant count is:"+consonantCount);
  }
  public static void main(String[] args){
    String str="Hello World";
    String str1="madam";
    String reverse=reverseString(str);
    System.out.println("Reversed string is:"+reverse);
    System.out.println(isPalindrome(str1)? "Palindrome" : "Not a Palindrome");
    countVowelsConsonants(str);
  }
}
