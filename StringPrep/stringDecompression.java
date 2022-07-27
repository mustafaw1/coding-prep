package StringPrep;

public class stringDecompression {

    public static String decompress(String str) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int num = 0;
        char nextchar = ' ';
        while (index < str.length()) {
            num = 0;
            char c = str.charAt(index);
            if (Character.isAlphabetic(c)) {
                nextchar = c;
                index++;
            }
            while (Character.isDigit(c)) {
                int temp = Integer.parseInt("" + c);
                num = (num * 10) + temp;
                index++;
                
                if (index >= str.length())
                    break;
                c = str.charAt(index);

            }
            for (int i = 0; i < num; i++) {
                result.append(nextchar);
            }

        }
        return result.toString();

    }

    public static void main(String[] args) {
        String str = "a20b11c5";
        System.out.print(decompress(str));
    }

}
