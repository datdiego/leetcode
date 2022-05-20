class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        even_digits = 0
        
        for num in nums:
            digits = 0
            while num > 0:
                digits += 1
                num /= 10
                
            
            if digits % 2 == 0:
                even_digits += 1
            
        return even_digits
