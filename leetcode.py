class Solution:
    def addBinary(self, a: str, b: str) -> str:
        carry = 0
        final = ""
        i, j = len(a) - 1, len(b) - 1
        while i > -1 and j > -1:
            sum = int(a[i]) + int(b[j]) + carry
            final = str(sum % 2) + final
            carry = sum // 2
            i -= 1
            j -= 1

        while i > -1:
            sum = int(a[i]) + carry
            final = str(sum % 2) + final
            carry = sum // 2
            i -= 1

        while j > -1:
            sum = int(b[j]) + carry
            final = str(sum % 2) + final
            carry = sum // 2
            j -= 1
        if carry:
            final = str(carry) + final
        return final
