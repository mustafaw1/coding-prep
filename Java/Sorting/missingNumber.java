package Java.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;



public class missingNumber {
    public static LinkedHashSet removeDups(int[] nums){
        LinkedHashSet<Integer> lset = new LinkedHashSet();
        for (int i = 0; i < nums.length; i++) {
            lset.add(nums[i]);
        } 
        return lset;
    }


    public static List<Integer> missingNumbers(int[] nums) {
        LinkedHashSet<Integer> uniqueNums = removeDups(nums);
        List<Integer> missingnumbers = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if(!uniqueNums.contains(i)){
                missingnumbers.add(i);
            }
        }
        return missingnumbers;

    }
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.print(missingNumbers(nums));
    }
    
}
