package StringPrep;

public class CharToNum {
    // public static int charToNum(char[] arr) {
    // int num = Integer.parseInt(String.valueOf(arr));
    // return num;

    // }

    // public static void main(String[] args) {
    // char[] arr = { '1', '2', '3', '4', '5' };
    // System.out.print(charToNum(arr));
    // }

    // public static int stringToNum(String str) {
    //     int num = 0;
    //     String numberOnly = str.replaceAll("[^0-9]", "");
    //     num = Integer.parseInt(numberOnly);
    //     return num;
    // }

    // public static void main(String[] args) {
    //     String str = "a20b11c5";
    //     System.out.print(stringToNum(str));
    // }

    public static void main(String[] args) {

		String str = "a20b11c5";

		String numString = "";

		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);

			
			if (ascii >= 48 && ascii <= (57)) {
				numString += (char) ascii;
			}
		}
		
		int numbers = Integer.parseInt(numString);

		System.out.println(numbers);
	}

}
