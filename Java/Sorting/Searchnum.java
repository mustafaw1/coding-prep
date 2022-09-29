package sortingPrep;

class Searchnum {

    public static boolean findNum(int[] arr, int num)
    {
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {23, 14, 20, 89, -65};
        int num = 23;
        for (int i = 0; i < arr.length; i++) {
          
        }
        findNum(arr, num);
       
    }

    
}
