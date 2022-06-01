class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // tail follows array from back
        int tail = m + n - 1;
            
        // while m and n are greater than zero, has not reached the beginning.
        while(m > 0 && n > 0){
            
            //if nums1 is larger than nums2, then insert nums1 to the tail.
            if(nums1[m - 1] > nums2[n-1]){
                nums1[tail] = nums1[m-1];
                m--;
            
            // else if nums1 is smaller, then add nums2 to the tail. 
            } else {
                nums1[tail] = nums2[n-1];
                n--;
                
            }
            tail--;
            
        }
        
        //keep adding to the end of the r=array until no more nums2 are left.
        while( n > 0){
            nums1[tail] = nums2[n-1];
            n--;
            tail--;
        }
        
    }
}
