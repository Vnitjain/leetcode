class Solution:
    def minimumAverage(self, nums):
        nums = sorted(nums)
        min = (2**31) - 1
        i = 0
        while i < len(nums) - i - 1:
            average = (nums[i] + nums[-i - 1]) / 2
            if average < min:
                min = average
            i += 1
        return min


s = Solution()
print(s.minimumAverage([7, 8, 3, 4, 15, 13, 4, 1]))
print(s.minimumAverage([1, 9, 8, 3, 10, 5]))
