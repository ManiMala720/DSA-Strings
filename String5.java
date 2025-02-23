public class String5 {
  public static void firstNonRepeated(String s){
    int[] cnt=new int[256];
    s=s.toLowerCase();
    for(char ch:s.toCharArray()){
      cnt[ch]++;
    }
    for(char ch:s.toCharArray()){
      if(cnt[ch]==1){
        System.out.println("The first non-repeated character is:"+ch);
        return;
      }
    }
  }
  public static void checkAnagram(String s,String t){
    s = s.toLowerCase();
    t = t.toLowerCase();
    if(s.length()!=t.length()){
      System.out.println("Not an Anagram");
      return;
    }
    else{
      int[] a=new int[256];
      for(int i=0;i<s.length();i++){
        a[s.charAt(i)]++;
        a[t.charAt(i)]--;
      }
      for(int i=0;i<a.length;i++){
        if(a[i]!=0){
          System.out.println("Not an Anagram");
          return;
        }
      }
      System.out.println("Anagram");
    }
  }
  public static void main(String[] args){
    String s="Einstein";
    String s1="Care";
    String s2="Race";
    firstNonRepeated(s);
    checkAnagram(s1,s2);
  }
}
