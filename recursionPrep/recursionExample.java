public class recursionExample {
    public static void printRecursive(int[] arr, int i){
        int len = arr.length;
        if(i == len)
         return;
        System.out.println(arr[i]);
        printRecursive(arr, i+1);
        
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        printRecursive(arr, 0);
        
    }
}
