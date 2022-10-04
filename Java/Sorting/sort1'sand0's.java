package sortingPrep;

public class sortzeroandone2 {
    public static int[] sort0and1(int[] arr) {
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                oneCount++;
        }
        for (int i = 0; i < oneCount; i++) {
            arr[i] = 1;
        }

        for (int i = oneCount; i < arr.length ; i++) {
            arr[i] = 0;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1 };
        sort0and1(arr);
    }
}
