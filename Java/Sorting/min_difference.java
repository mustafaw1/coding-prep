package Java.Sorting;

import java.util.Arrays;

public class min_difference {
    public static int minDiffernece(int[] arr, int k){
        int len = arr.length;
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int a = 0;
        int b = k - 1;
        while (b < len) {
            result = Math.min(result, arr[b] - arr[a]);
            a++;
            b++;
            
        }
        return result;

    }
    //[1, 2, 3 ,4, 5, 6, 7]
    public static void main(String[] args) {
        int[] arr = {9,4,1,7};
        int k = 2;
        System.out.println(minDiffernece(arr, k)); 
    }
    
}
