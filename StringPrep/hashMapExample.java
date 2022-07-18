import java.util.*;
public class hashMapExample {
    public static void main(String[] args) {
        String str = "aaaaabbbcccccef";
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        char[] Carr = str.toCharArray();
        for (int i = 0; i < Carr.length; i++) {
            if(count.containsKey(Carr[i])){
                count.put(Carr[i], count.get(Carr[i]) + 1);
            }
            else{
                count.put(Carr[i], 1);
            }
            
        }
        for(Map.Entry entry : count.entrySet()){
            System.out.print(entry.getKey() + "" + entry.getValue());
          }
    }
}
