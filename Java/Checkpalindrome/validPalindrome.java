package Java.Checkpalindrome;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        String trimmed = s.replaceAll("[^a-zA-Z0-9]", ""); 
        int j = trimmed.length() - 1;
        trimmed = trimmed.toLowerCase();
        for (int i = 0; i < trimmed.length(); i++, j--) {
            if(trimmed.charAt(i) != trimmed.charAt(j)){
                return false;
            }
            
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }
    
}
