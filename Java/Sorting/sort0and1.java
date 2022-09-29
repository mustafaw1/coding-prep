package sortingPrep;

public class sort0and1 {
    public static String sortoneZero(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                sb.append(str.charAt(i));
            else if(str.charAt(i) == '0')
                sb.insert(0, str.charAt(i));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "01011010000";
        System.out.print(sortoneZero(str));
       
    }

}
