class Solution:
    def containsNearbyDuplicate(self, nums, k: int) -> bool:
        count = {}
        for i in range(len(nums)):
            currentNum = nums[i]
            if currentNum in count.keys() and i - count[currentNum] <= k:
                return True
            count[currentNum] = i
        return False


s = Solution()
print(s.containsNearbyDuplicate([1, 2, 3, 1], 3))
print(s.containsNearbyDuplicate([1, 0, 1, 1], 1))
print(s.containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2))
print(s.containsNearbyDuplicate([99, 99], 2))
