class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums) - 1
        print(length)
        k = 1
        while length > 0:
            if nums[length] == nums[length - 1]:
                nums.pop(length)
                length -= 1
            else:
                k +=1
                length -=1
        print('k=',k)
        return k
