class Solution:
    def minimumOperations(self, nums):
        sum = 0
        for i in nums:
            div = i / 3
            if div != 0:
                sum += min(i - int(div) * 3, ((int(div) + 1) * 3) - i)
        return sum


s = Solution()
print(s.minimumOperations([1, 2, 3, 4]))
print(s.minimumOperations([3, 6, 9]))
