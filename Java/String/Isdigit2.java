public class Isdigit2 {
    public static String findDigit(String str) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < str.length()) {
            Character c = str.charAt(index);
            index++;
            if (Character.isDigit(c)) {
                String s = Character.toString(c);
                int num = Integer.parseInt(s);
                 result.append(num);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "a55b";
        System.out.print(findDigit(str));
    }

}
