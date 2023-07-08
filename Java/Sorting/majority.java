package Java.Sorting;

import java.util.HashMap;

public class majority {
    // public static int majorityElement(int[] nums) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < nums.length; i++) {
    // if (map.containsKey(nums[i])) {
    // int count = map.get(nums[i]) + 1;
    // if (count > nums.length / 2) {
    // return nums[i];
    // } else
    // map.put(nums[i], count);

    // } else
    // map.put(nums[i], 1);
    // }
    // return -1;
    // }

    public static int majorityElement(int[] nums) {
        int count = 1;
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[result]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                result = i;
                count = 1;
            }
        }
        return nums[result];

    }

    public static void main(String[] args) {
        int[] nums = { 2,2,1,1,1,2,2 };
        System.out.print(majorityElement(nums));
    }

}
