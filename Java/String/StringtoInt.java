package String;

public class StringtoInt {
    public static int stringtoInt(String str){
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = Character.getNumericValue(str.charAt(i));
            num = (num * 10) + temp;
            
        }

        return num;

    }
    public static void main(String[] args) {
        String str = "9876";
        System.out.print(stringtoInt(str));
    }
    
}
