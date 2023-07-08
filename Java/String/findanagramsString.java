package Java.String;

import java.util.List;

public class findanagramsString {
    public static List<Integer> findAnagrams(String s, String p) {
        char[] arr = s.toCharArray();
        char[] arr2 = p.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < p.length(); j++) {
                if(arr2.equals(arr)){
                    
                }
            }
        }
        
        return null;
        
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
        
    }
    
}
