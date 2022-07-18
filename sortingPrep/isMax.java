import java.util.ArrayList;

class isMax {
    public static boolean isConvertable(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // int[] values = new int[strings.length];
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            if (isConvertable(args[i]))
                result.add(Integer.parseInt(args[i]));
        }

        System.out.println(maxNumber(result));
    }

    public static int maxNumber(ArrayList<Integer> result) {
        int max = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) > max) {
                max = (result.get(i));
            }
        }
        return max;
    }

}
