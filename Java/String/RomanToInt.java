package String;

import java.util.HashMap;

public class RomanToInt {
    public static int romantoInt(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (map.get(str.charAt(i)) >= map.get(str.charAt(i + 1)))
                result += map.get(str.charAt(i));
            else
                result -= map.get(str.charAt(i));

        }
        result = result + map.get(str.charAt(str.length()-1));
        return result;
    }

    public static void main(String[] args) {
        String str = "LVIII";
        System.out.print(romantoInt(str));
    }

}
