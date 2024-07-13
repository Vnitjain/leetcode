class Solution:
    def maxSum(self, nums) -> int:
        freqCount = {}
        for i in nums:
            maxDigit = self.maxDigit(i)
            if maxDigit in freqCount:
                freqCount[maxDigit].append(i)
            else:
                freqCount[maxDigit] = [i]
        maximum = -1
        for i in freqCount.keys():
            currentTerm = freqCount[i]
            summ = sum(sorted(currentTerm)[-2:])
            if len(currentTerm) > 1 and summ > maximum:
                maximum = summ
        return maximum

    def maxDigit(self, num):
        max = -(2**31) - 1
        while num != 0:
            remainder = num % 10
            if remainder > max:
                max = remainder
            num = int(num / 10)
        return max


s = Solution()
print(s.maxSum([35, 52, 74, 92, 25, 65, 77, 1, 73, 32]))
