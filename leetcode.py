width = [2, 3, 1, 2, 3, 2, 3, 3]


def serviceLane(n, cases):
    finalList = []
    for i in cases:
        j = i[0]
        minWidth = 2**31 - 1
        while j <= i[1]:
            minWidth = min(width[j], minWidth)
            j += 1
        finalList.append(minWidth)
    return finalList


print(serviceLane(8, [[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]]))
