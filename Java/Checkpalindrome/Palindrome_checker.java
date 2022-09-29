package Checkpalindrome;

public class Palindrome_checker {

    public static boolean isPalindrome_recursive(String str) {

        if (str.length() < 2) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindrome_recursive(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String str = "daad";
        System.out.print(isPalindrome_recursive(str));
    }
}