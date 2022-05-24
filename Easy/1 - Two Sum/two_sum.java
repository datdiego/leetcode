
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        outer:
        for(int index1=0; index1 < nums.length; index1++){
            for(int index2 = 1; index2 < nums.length; index2++){
                if(index1 == index2){
                    break;
                }
                //System.out.println("index1 : " + index1);
                //System.out.println("index2 : " + index2);
                if(nums[index1] + nums[index2] == target ){
                    //System.out.println("FOUND!");
                    sol[0]=index1;
                    sol[1]=index2;
                    break outer;
                    
                }
            }
        }
        return sol;
    }
}
