class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1
        j = n - 1
        k = m + n - 1
        while j >= 0:
            currenti = nums1[i]
            currentj = nums2[j]
            if i >= 0 and currenti > currentj:
                nums1[k] = currenti
                i -= 1
            else:
                nums1[k] = currentj
                j -= 1
            k -= 1
        return nums1


s = Solution()
print(s.merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3))
print(s.merge([0], 0, [1], 1))
print(s.merge([4, 5, 6, 0, 0, 0], 3, [1, 2, 3], 3))
