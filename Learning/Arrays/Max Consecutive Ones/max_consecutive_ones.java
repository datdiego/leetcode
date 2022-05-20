class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        //Tracking variables
        int max = 0;
        int max_window = 0; // Will return max sub sequence in array of ones
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                max++;
                //IF new max sub array is larger than old max variable, then it is changed.
                if(max > max_window){
                    max_window = max;
                }
            // Start max variable to begin count.
            } else {
                max=0;
            }
            
        }
        return max_window;
        
    }
}
