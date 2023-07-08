package Java.Sorting;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class findallNumbers {
    public static LinkedHashSet<Integer> removeDups(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            
        }
        return set;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i;
        LinkedHashSet<Integer> uniqueNums = removeDups(nums);
        List<Integer> missingNumbers = new ArrayList<>();
        for (i = 1; i <= nums.length; i++) {
            if(!uniqueNums.contains(i)){
                missingNumbers.add(i);
            }
            
        }
        return missingNumbers;
        
    }


    public static void main(String[] args) {
        int[] nums = { 4,3,2,7,8,2,3,1 };
        System.out.print(findDisappearedNumbers(nums));
    }

}
