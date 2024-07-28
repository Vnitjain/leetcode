class Solution:
    def majorityElement(self, nums) -> int:
        nums = sorted(nums)
        return nums[int(len(nums) / 2)]


s = Solution()
print(s.majorityElement([3, 2, 3]))
print(s.majorityElement([2, 2, 1, 1, 1, 2, 2]))
