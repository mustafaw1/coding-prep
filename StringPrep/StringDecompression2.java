package StringPrep;

public class StringDecompression2 {

    public static String decompress(String str) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int num = 0;
        char nextchar = ' ';
        int Digits = ' ';
        while (index < str.length()) {
            num = 0;
            char c = str.charAt(index);
            if (Character.isAlphabetic(c)) {
                nextchar = c;
                index++;       
             
            }
            while (index < str.length() && Character.isDigit(c)) {
                Digits.app
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
