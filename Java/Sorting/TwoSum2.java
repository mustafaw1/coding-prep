package Sorting;
import java.util.Arrays;
import java.util.HashSet;

public class TwoSum2 {
    public static int[] twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (set.contains(temp)) {
                result = new int[2];
                result[0] = arr[i];
                result[1] = temp;

            }

            set.add(arr[i]);

        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 9, 12, 8, 24 };
        int target = 12;
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }

}
