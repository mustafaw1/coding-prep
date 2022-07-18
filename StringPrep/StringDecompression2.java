public class StringDecompression2 {

   

    public static String digitTostring(String str) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int num = 0;
        int temp = 0;
        char nextchar = ' ';
        while (index < str.length()) {
          
            char c = str.charAt(index);
            if (!Character.isDigit(c)) {
                nextchar = c;
                index++;
            } 
            else if(Character.isDigit(c)){
                String s = Character.toString(c);
                temp = Integer.parseInt(s);
                num = (num * 10) + temp;
                index++;
                if (index >= str.length())
                    break;
                c = str.charAt(index);
               
            }
          
            for (int i = 0; i < num; i++) {
                result.append(nextchar);
            }
            
         
            

        }
        return result.toString();

    }

    public static void main(String[] args) {
        String str = "a20b11c5";
        System.out.print(digitTostring(str));
    }
}
