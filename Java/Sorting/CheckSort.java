package Java.Sorting;

public class CheckSort {
    public static boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7 , 8};
        System.out.print(checkSort(arr));
    }
    
}
