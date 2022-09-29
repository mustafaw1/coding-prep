package StringPrep;

import java.util.*;
public class hashMapExample {
    public static void main(String[] args) {
        String str = "aaaaabbbcccccef";
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(count.containsKey(arr[i])){
                count.put(arr[i], count.get(arr[i]) + 1);
            }
            else{
                count.put(arr[i], 1);
            }
            
        }
        for(Map.Entry entry : count.entrySet()){
            System.out.print(entry.getKey() + "" + entry.getValue());
          }
    }
}
