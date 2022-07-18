public class mixedType {

    public static boolean isConvertable(String s) {
        int index = 0;
        while (index < s.length()) {
         if(Character.isDigit(s.charAt(index)))
           return true; 
           index++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "2";
        System.out.println(isConvertable(s));
    }

}

// public static void main(String args[]) {
// int sum = 0;
// String[] Sarray = { "23", "53", "63", "Taha" };

// int[] array = new int[Sarray.length];
// for (int i = 0; i < Sarray.length; i++) {
// array[i] = Integer.parseInt(Sarray[i]);
// sum = sum + array[i];
// }
// System.out.println(sum);
// }
// }
