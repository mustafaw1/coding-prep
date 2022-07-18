public class stringCompression {

    public static String compressedString(String str) {
        int len = str.length();
        StringBuilder result = new StringBuilder();    
        for (int i = 0; i <= len-1; i++) {
            int count = 1;
            while (i < len -1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
               
            }
            result.append(str.charAt(i) + "" +count);
         
            
        }
        return result.toString();
        
    }

    public static void main(String[] args) {
        String str = "aaaaabbbcccccef";
        System.out.print(compressedString(str));
    }
}
