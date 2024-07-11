class Solution:
    def generate(self, numRows):
        result = []
        for i in range(numRows):
            if i == 0:
                result.append([1])
            else:
                tempList = []
                tempList.append(1)

                previousRow = result[i - 1]
                i = 0
                while len(previousRow) > 1 and i < len(previousRow) - 1:
                    tempList.append(previousRow[i] + previousRow[i + 1])
                    i += 1

                tempList.append(1)
                result.append(tempList)
        return result


s = Solution()
print(s.generate(1))
