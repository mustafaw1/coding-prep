package Java.String;

import java.util.Arrays;

public class greatestcommonPreffix {
    public static String longestCommonPrefix(String[] strs){
        int len = strs[0].length();
        Arrays.sort(strs);
        int size = strs.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if(strs[0].charAt(i) == strs[size - 1].charAt(i)){
               result.append(strs[0].charAt(i));
            }
            else{
                break;
            }
            
        }
        return result.toString();

    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.print(longestCommonPrefix(strs));
    }
    
}
