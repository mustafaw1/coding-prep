package Java.Sorting;

import java.util.Arrays;

public class secondLargest {
    public static int second_largest(int[] nums){
        Arrays.sort(nums);
        int second_largest = 0;
        int len = nums.length - 2;
        //2,,3,4,5,6,8,10
        for (int i = 0; i < nums.length; i++) {
            if(i == len)
            second_largest = nums[i];
        }
        return second_largest;
        

    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 4, 3, 8, 10};
        System.out.println(second_largest(nums));

    }
}
