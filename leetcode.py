class Solution:
    def getEncryptedString(self, s: str, k: int) -> str:
        lens = len(s)
        finalString = ""
        for i in range(lens):
            finalString += s[(i + k) % lens]
        return finalString


s = Solution()
print(s.getEncryptedString("dart", 3))
