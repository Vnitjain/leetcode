class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:

        length = len(s)
        if length == 1:
            return [0]
        prefix = [length] * length

        for i in range(length):
            if s[i] == c:
                prefix[i] = 0
            else:
                if i > 0:
                    prefix[i] = prefix[i - 1] + 1

        for i in range(length - 1, -1, -1):
            if s[i] == c:
                prefix[i] = 0
            else:
                if i < length - 1:
                    prefix[i] = min(prefix[i + 1] + 1, prefix[i])

        return prefix
