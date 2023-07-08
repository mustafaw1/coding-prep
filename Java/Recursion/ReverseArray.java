package Java.Recursion;

public class ReverseArray {

    
   public static int[] backWardArray(int[] arr, int start, int end) {

    if (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        backWardArray(arr, start + 1, end - 1);
    }
    return arr;
}

 public static void main(String[] args) {
     int [] arr = {12,4,6,8,9,2,1,0};
     int [] reversedArray= backWardArray(arr, 0, arr.length-1);
     for (int i = 0; i < reversedArray.length; i++) {
        System.out.print(arr[i]+ " ");
     }
 }


    
}
