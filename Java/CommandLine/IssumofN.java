public class IssumofN {
    public static boolean isConvertable(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                return true;
        }    
        return false; }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (isConvertable(args[i])){
                sum = sum + Integer.parseInt(args[i]);
            }
        }
        System.out.println(sum);
    }
}   

// *********************************** */
// class IssumofN {
// public static void main(String args[]) {
// if (args.length > 4) {
// int sum = 0;
// String[] Sarray = {};
// int[] array = new int[Sarray.length];
// for (int i = 0; i < args.length; i++) {
// array[i] = Integer.parseInt(Sarray[i]);
// sum = sum + array[i];
// }
// System.out.println(sum);
// }
// }
// }
