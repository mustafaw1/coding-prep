package Java.Sorting;

public class rmDuplicates {
    
    public static int[] removeDuplicates(int[] nums) {
        int p = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1])
              nums[p] = nums[i + 1];
              p = p + 1;

        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            
        }
    }
    
}
