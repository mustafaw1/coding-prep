package Java.Sorting;

public class rmDuplicates {
    public static int removeDuplicates(int[] nums) {
        int p = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1])
              nums[p++] = nums[i + 1];

        }
        return p;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.print(removeDuplicates(nums));
    }
    
}
