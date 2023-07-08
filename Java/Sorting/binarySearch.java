package Java.Sorting;



public class binarySearch {
    public static int binaryS(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == num) {
                return mid;
            }

            if (num > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num = 9;
        System.out.println(binaryS(arr, num));
    }
}
