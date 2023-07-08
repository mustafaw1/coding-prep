package Java.Sorting;

public class isMin {

    public static int findMin(int[] arr, int startIndex, int lastIndex) {
        int max = arr[startIndex];
        int value = 0;
        for (int i = startIndex; i <= lastIndex; i++) {
            if (arr[i] > max) {
                max = arr[i];
                value = arr[i];

            }
            
        }
        return value;
        
    }

    public static void main(String[] args) {
        int[] arr = { 5, 65, 54, 37, 90 };
        int startIndex = 0;
        int lastIndex = 4;
        for (int i = 0; i <= arr.length-1; i++) {

        }
        System.out.println(findMin(arr, startIndex, lastIndex));
    }
}
