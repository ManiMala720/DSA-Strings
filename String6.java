import java.util.HashMap;
public class String6 {
  public static void romanToInteger(String s){
    HashMap<Character,Integer> hm=new HashMap<>();
    hm.put('I',1);
    hm.put('V',5);
    hm.put('X',10);
    hm.put('L',50);
    hm.put('C',100);
    hm.put('D',500);
    hm.put('M',1000);
    int sum=0;
    for(int i=0;i<s.length();i++){
      if(i+1<s.length() && hm.get(s.charAt(i)) > hm.get(s.charAt(i+1))){
        sum+=hm.get(s.charAt(i));
      }
      else{
        sum+=hm.get(s.charAt(i+1))-hm.get(s.charAt(i));
        i+=1;
      }
    }
    System.out.println("Conversion of roman to integer is:"+sum);
  }
  public static void integerToRoman(int num){
    HashMap<Integer,String> map=new HashMap<>();
    map.put(1,"I");
    map.put(4,"IV");
    map.put(5,"V");
    map.put(9,"IX");
    map.put(10,"X");
    map.put(40,"XL");
    map.put(50,"L");
    map.put(90,"XC");
    map.put(100,"C");
    map.put(400,"CD");
    map.put(500,"D");
    map.put(900,"CM");
    map.put(1000,"M");
    int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String s="";
    for(int i=0;i<values.length;i++){
      if(num >=values[i]){
        int q=num/values[i];
        num=num%values[i];
        for(int j=0;j<q;j++){
          s+=map.get(values[i]);
        }
      }
    }
    System.out.println("Conversion of integer to roman is:"+s);
  }
  public static void main(String[] args){
    String s="MCMXCIV";
    int i=1994;
    romanToInteger(s);
    integerToRoman(i);
  }
}
