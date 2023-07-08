package Java.Sorting;
public class Issort {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 12, 59, -23,  };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

            System.out.println(arr[i]);
        }
    }
}