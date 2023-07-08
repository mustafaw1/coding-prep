package Java.Recursion;

public class BinarySearch {
    public static int binarySearchRecursive(int arr[], int left, int right, int num) {

        if (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == num)
                return mid;

            if (num < arr[mid])
                return binarySearchRecursive(arr, left, mid - 1, num);
            else

                return binarySearchRecursive(arr, mid + 1, right, num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int left = 0;
        int right = arr.length - 1;
        int num = 9;
        System.out.print(binarySearchRecursive(arr, left, right, num));
    }

}
