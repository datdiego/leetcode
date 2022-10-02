class Solution(object):
    def sortArrayByParity(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        i = len(nums)-1
        while i > -1:
            if nums[i]%2 != 0:
                temp = nums.pop(i)
                nums.append(temp)
            i-=1
        return nums
