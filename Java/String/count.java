package StringPrep;

public class count {
    public static void countChar(String str) {
        int MAX_CHAR = 256;

        int arr[] = new int[MAX_CHAR];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            arr[str.charAt(i)]++;
        }
        char carray[] = new char[str.length()];
        for (int i = 0; i < length; i++) {
            carray[i] = str.charAt(i);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == carray[j]) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(str.charAt(i)+ ":" +arr[str.charAt(i)]);

            }

        }

    }

    public static void main(String[] args) {
        String str = "aaaaabbbcccccef";
        countChar(str);
    }
}
