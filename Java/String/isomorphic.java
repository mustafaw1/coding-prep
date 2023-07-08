package Java.String;

import java.util.HashMap;

public class isomorphic {
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length())
           return false;
           HashMap<Character, Character> characterMap = new HashMap<Character, Character>();
           for(int i=0; i<s.length(); i++) {
               char c1 = s.charAt(i);
               char c2 = t.charAt(i);
               if(characterMap.containsKey(c1)) {
                   if(characterMap.get(c1) != c2) {
                       return false;
                   }
               } else {
                   if(characterMap.containsValue(c2)) {
                       return false;
                   }
                   characterMap.put(c1, c2);
               }
           }
        return false;

    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.print(isIsomorphic(s, t));
    }
    
}
