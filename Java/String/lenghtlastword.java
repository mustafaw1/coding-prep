package Java.String;

public class lenghtlastword {

    public static int lengthofLastWord(String s) {
        int i = s.length()-1;
        while (i >=0 && s.charAt(i) == ' ') {
            i--;           
        }
        int lastIndex = i;
        while (i>=0 && s.charAt(i) != ' ') {
            i--;
            
        }
        return lastIndex - i;



    //     int count = 0;
    //     boolean isCharacter = false;

    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         if (Character.isLetter(s.charAt(i))) {
    //             isCharacter = true;
    //             count++;
    //         }

    //         else {
    //             if (isCharacter == true)
    //                 return count;
    //         }
    //     }
    //     return count;
     }

    public static void main(String[] args) {
        String s = "   fly me   to   the mustafa    ";
        System.out.print(lengthofLastWord(s));
    }

}
