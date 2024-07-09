class Solution:
    def maxProfit(self, prices):
        l, r = 0, 1
        max = 0
        while r < len(prices):
            difference = prices[r] - prices[l]
            if difference < 0:
                l = r
            elif difference > max:
                max = difference
            r += 1
        return max


s = Solution()
print(s.maxProfit([7, 1, 5, 3, 6, 4]))
