package StringPrep;

import java.util.ArrayList;

public class strings {
    public static void main(String[] args) {
        String s = "a20b11c5";
        System.out.println(decompress(s));
    }

    public static String charToString(ArrayList<Character> arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            result.append(arr.get(i));
        }
        return result.toString();
    }

    public static int stringToInt(ArrayList<Character> arr) {
        int num = Integer.parseInt(String.valueOf(charToString(arr)));
        return num;

    }

    public static String decompress(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isLetter(c)) {
                ArrayList<Character> digitarr = new ArrayList<Character>();
                index++;
                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                    digitarr.add(s.charAt(index));
                    index++;
                }
                for (int i = 0; i < stringToInt(digitarr); i++) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}