import java.util.Arrays;
public class String8 {
  public static void longestCommonPrefix(String[] strs){
    Arrays.sort(strs);
    String first=strs[0];
    String last=strs[strs.length-1];
    int current=0;
    while(current<first.length() && current<last.length() && first.charAt(current)==last.charAt(current)){
      current++;
    }
    
    System.out.println(first.substring(0,current));
  }
  
  public static void main(String[] args){
    String[] strs={"flower","flow","flight"};
    longestCommonPrefix(strs);
    
  }
}
