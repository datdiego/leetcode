class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        int length = nums.length;
        int temp = 0;
        
        for(int i = nums.length - 1 ; i > 0; i--){
            System.out.println("\nnums[i = "+i+"] : " + nums[i]);
            /*
            System.out.print(">> [");
            for(int j = 0; j < nums.length; j++){
                System.out.print(" " + nums[j] + " ");
            }
            System.out.print("]\n");
            */
            
            if(nums[i] == nums[i-1] && i != 0){
                //Best approach is to send the repeated number to the back and then shift everything to the left.
                //System.out.println("## nums["+i+"] : " + nums[i] +" == nums["+(i-1)+"] : " + nums[i-1]);
                //System.out.println("length : " + length);
                
                for(int x = i ; x < length; x++){
                    //System.out.println("\t SHIFT LEFT :: nums[x-1 = "+ (x-1) + "] = "+ nums[x-1] + " << nums[x : "+ x +"] = " + nums[x]);
                    nums[x-1] = nums[x];
                }
                
                length--;
            } else {
                k++;
            }
            /*
            System.out.print("<< [");
            for(int j = 0; j < nums.length; j++){
                System.out.print(" " + nums[j] + " ");
            }
            System.out.print("]\n");
            */
        }
        
        return k;
    }
}
