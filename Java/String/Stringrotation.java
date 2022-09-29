package StringPrep;

public class Stringrotation {

    public static boolean isSubstring(String s1, String s2) {
       return s1.contains(s2);
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int count = 0;
        int i = 0;
        int j = 0;
        String s3 = s1 + s1;
        while (j < s3.length() && count < s1.length()) {
            if (isSubstring(s1, s3)) {
                count++;
                i++;
            } else {
                count = 0;
            }
            j++;
        }
        if (count == s1.length())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "ottlewaterb";
       
        System.out.print(isRotation(s1, s2));
        
    }
}

// for(int i=0;i<str1.length();i++){
// String str3=str1.substring(i) + str1.substring(0,i);
// if(str3.equals(str2)){
// return true;
// }
// }