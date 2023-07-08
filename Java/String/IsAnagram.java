package Java.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsAnagram {
    public static List<List<String>> isAnagram(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String stringchars = String.valueOf(arr);

            if (!map.containsKey(stringchars))
                map.put(stringchars, new ArrayList<>());

            map.get(stringchars).add(s);
        }

        List<List<String>> resultList = new ArrayList<>();
        for (List<String> v : map.values()) {
            resultList.add(v);
        }
        return resultList;
    }

    public static void main(String[] args) {
        String[] str = { "tan", "cat", "aba", "baa", "tac" };
        // String str2 = "atn";
        System.out.print(isAnagram(str));
    }

}
