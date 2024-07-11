class Solution:
    def generate(self, numRows):
        result = [[1]]
        for i in range(1, numRows):
            tempList = [1]
            previousRow = result[i - 1]
            i = 0
            while i < len(previousRow) - 1:
                tempList.append(previousRow[i] + previousRow[i + 1])
                i += 1

            tempList.append(1)
            result.append(tempList)
        return result


s = Solution()
print(s.generate(5))
