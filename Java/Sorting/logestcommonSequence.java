package Java.Sorting;

import java.util.HashMap;

public class logestcommonSequence {
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], true);
            
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i] - 1)){
                map.put(nums[i], false);
            }
        }
        int max_length = 0;
        int max_startpoint = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == true){
                int temp_length = 1;
                int temp_startpoint = nums[i];
            
                while(map.containsKey(nums[i]+=1)){
                    temp_length++;
                }
                if(temp_length > max_length){
                    max_startpoint = temp_startpoint;
                    max_length = temp_length;
                }
            }
        }
     return max_length;
        
    }
    public static void main(String[] args) {
        int nums[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    
}
