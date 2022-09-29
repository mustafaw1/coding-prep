public class Isdigit {
    public static boolean isSpecial(char c) {
        char[] Sarray = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '?', '+' };
        for (int i = 0; i < Sarray.length; i++) {
            if (c == Sarray[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean IsDigit(char c) {

        if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || isSpecial(c))) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        char c = '?';
        System.out.println(IsDigit(c));
    }
}
