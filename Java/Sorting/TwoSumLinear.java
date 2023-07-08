package Java.Sorting;
import java.util.Arrays;
import java.util.HashMap;


public class TwoSumLinear {
    public static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> indexes = new HashMap<>();
        int[] result = {};
        for (int i = 0; i < arr.length; i++){
            int temp = indexes.getOrDefault(target - arr[i], -1);
            if (temp > -1) {                
                result = new int[2];
                result[0] = temp;
                result[1] = i;
            }
            indexes.put(arr[i], i);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 9, 12, 8, 24 };
        int target = 20;
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }

}
