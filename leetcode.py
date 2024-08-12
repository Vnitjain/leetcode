def appendAndDelete(s, t, k):
    print(s, t, k)
    lens, lent = len(s), len(t)
    minLength = min(lens, lent)
    i = 0
    operations = 0
    while i < minLength:
        if s[i] != t[i]:
            operations += lens - i + lent - i
            return "Yes" if operations <= k else "No"
        i += 1
    operations += lens - i if i < lens else lent - i
    return "Yes" if operations <= k else "No"


print(appendAndDelete("hackerhappy", "hackerrank", 9))
print(appendAndDelete("aba", "aba", 7))
print(appendAndDelete("ashley", "ash", 2))
print(appendAndDelete("abc", "", 3))
