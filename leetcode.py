class Solution:
    def countBits(self, n: int):
        countList = []
        for i in range(n + 1):
            countList.append(self.decimal_to_binary_count(i))
        return countList

    def decimal_to_binary_count(self, n):
        count = 0
        while n > 0:
            count += n % 2
            n = n // 2
        return count


print(Solution().countBits(2))
print(Solution().countBits(5))
