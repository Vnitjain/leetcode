class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) == 0:
            return True
        if len(t) == 0:
            return False
        i = 0
        j = 0
        while j < len(s) and i < len(t):
            if s[j] != t[i]:
                i += 1
            else:
                i += 1
                j += 1
        return j == len(s)


s = Solution()
print(s.isSubsequence("b", "abc"))
