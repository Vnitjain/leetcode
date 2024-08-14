def pickingNumbers(a):
    max_len = 0

    for i in range(len(a)):
        count1 = a.count(a[i])
        count2 = a.count(a[i] + 1)
        max_len = max(max_len, count1 + count2)

    return max_len


a = [1, 2, 2, 3, 1, 0, 0, 0, 0, 2]
result = pickingNumbers(a)
print("Result:", result)
