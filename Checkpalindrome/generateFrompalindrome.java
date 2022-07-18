public class generateFrompalindrome {
    public static Boolean checkGenfromPalindrome(String str) {
        int MAX_CHAR = 256;

        int arr[] = new int[MAX_CHAR];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            arr[str.charAt(i)]++;
        }
        int odd = 0;
        for (int i = 0; i < MAX_CHAR; i++) {
            if (arr[i] % 2 == 1) {
                odd++;
            }

            if (odd > 1) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        String str = "mlayalama";
        System.out.print(checkGenfromPalindrome(str));
    }

}
