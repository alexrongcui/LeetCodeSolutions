import java.lang.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for (int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i] ;
        }
        
        for (int i=0; i<nums.length; i++){
            int key = nums[i];
            int j = i - 1;
 
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        
        return nums;
        
    }
}