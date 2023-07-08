package Java.Sorting;

import java.util.Arrays;
import java.util.HashSet;

public class conatainduplicate {
    public static boolean findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i]))
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,1 };
        System.out.print(findDuplicate(nums));
    }

}
