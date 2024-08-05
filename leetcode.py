class Solution:
    def summaryRanges(self, nums):
        if len(nums) == 0:
            return nums
        i, j = 0, 1
        finalList = []
        while i < len(nums) and j < len(nums):
            if nums[j] != nums[j - 1] + 1:
                if i == j - 1:
                    finalList.append(str(nums[i]))
                else:
                    finalList.append(str(nums[i]) + "->" + str(nums[j - 1]))
                i = j
                j = i + 1
            else:
                j += 1
        if i == j - 1:
            finalList.append(str(nums[i]))
        else:
            finalList.append(str(nums[i]) + "->" + str(nums[j - 1]))
        return finalList


s = Solution()
# print(s.summaryRanges([0, 1, 2, 4, 5, 7]))
print(s.summaryRanges([0, 2, 3, 4, 6, 8, 9]))
