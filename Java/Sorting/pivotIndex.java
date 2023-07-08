package Java.Sorting;

public class pivotIndex {
    public static int pivotIndex(int[] nums) {
        int total_sum = 0;
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            total_sum += nums[i];
        }
        int right_sum = total_sum;
        for (int i = 0; i < nums.length; i++) {
            right_sum = right_sum - nums[i];
            if(left_sum == right_sum){
                return i;
            }
            left_sum += nums[i];
        }
        
        return -1;
        
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.print(pivotIndex(nums));
    }

}
