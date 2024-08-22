class Solution:
    def singleNumber(self, nums) -> int:
        if len(nums) == 1:
            return nums[0]
        nums = sorted(nums)

        i = 0
        while i < len(nums) - 1:
            if i == len(nums) - 1 or nums[i] != nums[i + 1]:
                return nums[i]
            i += 2
        return 0


s = Solution()
# print(s.singleNumber([2, 2, 1]))
print(s.singleNumber([1]))
