package Java.String;

public class compression {
    public static int compress(char[] chars) {
        String s = "";
        s += chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            char current = chars[i];
            char previous = chars[i - 1];
            if(current == previous){
               count++;
            }
            else{
                if(count > 1){
                    s += count;
                    count = 1;
                }
                s+=current;
            }
            
        }
        if(count>1){
            s += count;
            count = 1;

        }
        char[] c = s.toCharArray();
        return c.length;
        
    }    
    public static void main(String[] args) {
        char[] chararray = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.print(compress(chararray));
        
    }
    
}
