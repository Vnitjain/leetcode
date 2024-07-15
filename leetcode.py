class Solution:
    def numberOfLines(self, widths, s):
        sum = 0
        lineCount = 1
        for i in range(len(s)):
            currentWidth = widths[ord(s[i]) - 97]
            tempSum = sum + currentWidth
            if tempSum <= 100:
                sum = tempSum
            else:
                sum = currentWidth
                lineCount += 1
        return [lineCount, sum]


s = Solution()
print(
    s.numberOfLines(
        [
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
        ],
        "abcdefghijklmnopqrstuvwxyz",
    )
)
print(
    s.numberOfLines(
        [
            4,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
            10,
        ],
        "bbbcccdddaaa",
    )
)
