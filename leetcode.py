class Solution:
    def isPalindrome(self, s: str) -> bool:
        newString = ""
        for i in range(len(s)):
            currentChar = s[i]
            if currentChar.islower() or currentChar.isdigit():
                newString += currentChar
            elif s[i].isupper():
                newString += chr(ord(currentChar) + 32)

        i, j = 0, len(newString) - 1
        while i < j:
            if newString[i] != newString[j]:
                return False
            i += 1
            j -= 1
        return True


s = Solution()
print(s.isPalindrome("A man, a plan, a canal: Panama"))
print(s.isPalindrome("race a car"))
