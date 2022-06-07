import java.util.*;  

class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        
        // Add first instance so that does not check the same instance.
        ht.put(arr[0], (arr[0]*2));
        
        for(int i = 1; i < arr.length; i++){
            
            int val = arr[i];
            int doubleVal = arr[i]*2;
            
            // Find if the hashtable has the double value or key.
            if((ht.containsKey(doubleVal) || ht.containsValue(val))){
                System.out.println(ht);
                return true;
                
            }
            
            ht.put(val, doubleVal);
            
            
        }
        System.out.println(ht);
        return false;
        
    }
}
