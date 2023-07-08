package Java.Sorting;

public class replaceRight {
    public static int[] replaceElements(int[] arr) {
        int size = arr.length;
        int temp;
        int maxNum = -1;
        for (int i = size - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = maxNum;
            maxNum = Math.max(maxNum, temp);

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        replaceElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
