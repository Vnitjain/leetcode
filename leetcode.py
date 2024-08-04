class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map = {}
        revMap = {}
        s = s.split(" ")
        if len(pattern) != len(s):
            return False
        for i in range(len(pattern)):
            currPattern = pattern[i]
            if currPattern in map.keys() and s[i] != map[currPattern]:
                return False
            elif currPattern not in map.keys():
                if s[i] in map.values():
                    return False
                map[currPattern] = s[i]
                revMap[s[i]] = map[currPattern]
        return True


s = Solution()
print(s.wordPattern("abba", "dog cat cat dog"))
print(s.wordPattern("abba", "dog cat cat fish"))
print(s.wordPattern("abba", "dog dog dog dog"))
