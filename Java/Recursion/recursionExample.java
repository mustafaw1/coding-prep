package recursionPrep;

public class recursionExample {
    public static void printRecursive(int i, int[] arr) {
        if (i == arr.length)
            return;
        System.out.print(arr[i] + " ");
        printRecursive(i + 1, arr);
       
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        printRecursive(0, arr);

    }
}
