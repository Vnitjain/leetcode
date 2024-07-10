class Solution:
    def missingNumber(self, nums):
        visited = [0] * (len(nums) + 1)
        for i in range(len(nums)):
            visited[nums[i]] = 1
        for j in range(1, len(visited)):
            if visited[j] == 0:
                return j
        return 0


s = Solution()
print(s.missingNumber([9, 6, 4, 2, 3, 5, 7, 0, 1]))
