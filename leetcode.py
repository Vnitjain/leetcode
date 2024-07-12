class Solution:
    def thirdMax(self, nums):
        setNums = set(nums)
        if len(setNums) < 3:
            return sorted(setNums)[-1]
        return sorted(setNums)[-3]
