import java.util.HashMap;
public class String7 {
  public static String largestOddNo(String s){
    for(int i=s.length()-1;i>=0;i--){
      char ch=s.charAt(i);
      if((ch-'0')%2==1){
        return s.substring(0, i+1);
      }
    }
    return "";
  }
  public static boolean checkRotationOfString(String s,String t){
    if(s.length()!=t.length()){
      return false;
    }
    String combine=s+s;
    return combine.contains(t);
  }
  public static boolean isomorphicstring(String s,String t){
    if(s.length()!=t.length()){
      return false;
    }
    HashMap<Character,Character> hm=new HashMap<>();
    HashMap<Character,Character> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
      char a=s.charAt(i);
      char b=s.charAt(i);
      if(hm.containsKey(a) && hm.get(a)!=b || map.containsKey(b) && map.get(b)!=a){
        return false;
      }
      hm.put(a,b);
      map.put(b,a);
    }
  return true;
  }
  public static void main(String[] args){
    String s="23475";
    String result=largestOddNo(s);
    System.out.println("The largest odd number in a string is:"+result);
    boolean check=checkRotationOfString("abcde","cdeab");
    System.out.println("Rotation of String:");
    System.out.println(check ? "Yes":"No");
    boolean checkIsomorphic=isomorphicstring("egg","add");
    System.out.println(checkIsomorphic ? "Isomorphic":"Not Isomorphic");
  }
}
