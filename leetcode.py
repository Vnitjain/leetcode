from typing import List, Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        return self.traverseTree(0, len(nums), nums)

    def traverseTree(self, i: int, j: int, nums: List[int]) -> Optional[TreeNode]:
        if i < j:
            mid = ((j - i) // 2) + i
            curr_node = TreeNode(nums[mid])
            curr_node.left = self.traverseTree(i, mid, nums)
            curr_node.right = self.traverseTree(mid + 1, j, nums)
            return curr_node
        return None
