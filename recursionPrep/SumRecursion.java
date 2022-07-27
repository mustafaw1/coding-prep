package recursionPrep;

public class SumRecursion {
    public static int sumRecursion(int[] arr, int i) {
        if (i <= 0)
            return 0;
        return sumRecursion(arr, i - 1) + arr[i - 1];

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        System.out.print(sumRecursion(arr, arr.length));
    }

}
