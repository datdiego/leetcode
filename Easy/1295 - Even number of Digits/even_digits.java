class Solution {
    public int findNumbers(int[] nums) {
        int even_digits = 0;
        
        //Goes through all the numbers in array
        for(int i=0; i < nums.length; i++){
            int num = nums[i];
            int digits = 0;
            //System.out.println("number: "+ num);
            
            //WHILE number is not zero, it will keep dividing it until it reaches zero.
            //adds to the digits variables.
            while( num > 0){
                num/=10;
                digits++;
                //System.out.println("\twhile number:" + num);
            }
            //System.out.println("\tPOST while number:" + num + "\t digits: " + digits);
            
            //If digits is even add to even_digits variable to return.
            if(digits%2 == 0){
                even_digits++;
            }
        }
        
        return even_digits;
    }
}
