package Java.String;

import java.util.Arrays;


public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(Arrays.equals(arr, arr2))
            return true;
        return false;

    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "tar";
        System.out.print(isAnagram(s, t));
    }

}
