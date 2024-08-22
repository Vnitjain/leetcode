class Solution:
    def removeDuplicates(self, nums) -> int:
        i = 0
        while i < len(nums):
            j = i + 1
            count = 0
            while j < len(nums) and nums[j] == nums[i]:
                if count > 0:
                    del nums[j]
                else:
                    j += 1
                count += 1
            i = j
        return len(nums)


s = Solution()
print(s.removeDuplicates([1, 1, 1, 2, 2, 3]))
print(s.removeDuplicates([0, 0, 1, 1, 1, 1, 2, 3, 3]))
