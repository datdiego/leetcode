class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;
        int tail = nums.length-1;
        int temp;
        
        //Check for all items backwards
        for(int i = nums.length-1; i > -1 ; i--){
            
            if(nums[i] == val){

                //Switch with temp
                temp = nums[i];
                nums[i] = nums[tail];
                nums[tail] = temp;
                //Reduce tail for one less element
                tail--;
            
                
            } else { //If value is not equal then add to k.
                k++;
            }
            
        }
        return k;
        
    }
}
