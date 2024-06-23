class Solution(object):
    def sumIndicesWithKSetBits(self, nums, k):
        sum = 0
        for i in range(len(nums)):
            if self.countOnes(bin(i)[2:]) == k:
                sum = sum + nums[i]
        return sum

    def countOnes(self, binaryNumber):
        count = 0
        for character in binaryNumber:
            if character == "1":
                count = count + 1
        return count


s = Solution()
print(s.sumIndicesWithKSetBits([5, 10, 1, 5, 2], 1))
