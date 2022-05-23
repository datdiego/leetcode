class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        sorted_squared = []
        for num in nums:
            sorted_squared.append(num**2)
        
        #sorting in ascending order
        sorted_squared.sort()
        
        return sorted_squared
