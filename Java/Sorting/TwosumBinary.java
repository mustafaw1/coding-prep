package Sorting;

import java.util.Arrays;

class Pair<T> {
    public T x;
    public T y;

}

public class TwosumBinary {

    public static int binaryS(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void findIndexof(int index1, int secondNumber){ 
         
        
    }

    public static Pair twosumBinary(int[] arr, int target, int[] arr2, Pair pair) {
        Arrays.sort(arr);
        int len = arr.length;
        int index1=-1;
        int index2;

        // Section 1
        for (int i = 0; i < len; i++) {
            int result = binaryS(arr, target - arr[i]);
            if (result>=0){ // we know that correspoding number exists
                index1 = i;
                break;
            }
        }

        // Section 2
        int secondNumber = target - arr[index1];
        index2 = findIndexOf(arr2, secondNumber);


        return new Pair(index1, index2)
        
        return pair;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 7, 2, 10, 16, 8, 9, 6 };
        int[] arr2 = arr.clone();
        int target = 8;
        Pair pair = new Pair();
        twosumBinary(arr, target, arr2, pair);
        System.out.println("(" + pair.x + "," + pair.y + ")");
    }

}
