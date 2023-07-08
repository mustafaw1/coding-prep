package Java.String;

public class reverse {
    public static void reveresString(char[] s){
        int start = 0;
        int end = s.length - 1;
        
        while (start < end) {
            if(s[start] != s[end]){
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                
            }
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reveresString(s);
    }
    
}
