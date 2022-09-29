class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        length = len(nums)-1
        
        while length > -1:
            if nums[length] == 0:
                nums.pop(length);
                nums.append(0)
                length -=1
            else:
                length -=1
        return
