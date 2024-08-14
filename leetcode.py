def getMoneySpent(keyboards, drives, b):
    keyboards = sorted(keyboards)
    drives = sorted(drives)
    max = -1
    for i in keyboards:
        for j in drives:
            sum = i + j
            if sum <= b and sum > max:
                max = sum
            elif sum > b:
                break
    return max
