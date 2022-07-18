public class Searchnum {

    public static int findNum(int[] arr, int num)
    {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {23, 14, 20, 89, -65};
        int num = 100;
        for (int i = 0; i < arr.length; i++) {
          
        }
        System.out.println(findNum(arr, num));
       
    }

    
}
