class Solution:

    def isHappy(self, n: int) -> bool:
        return self.isHappyTraverse(n, [])

    def isHappyTraverse(self, n, visited):
        visited.append(n)
        total = self.findSum(n)
        if total == 1:
            return True
        elif total in visited:
            return False
        return self.isHappyTraverse(total, visited)

    def findSum(self, n):
        n = str(n)
        total = 0
        for i in n:
            i = int(i)
            total += i * i
        return total


s = Solution()
print(s.isHappy(13))
