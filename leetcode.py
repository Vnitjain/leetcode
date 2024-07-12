class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        return self.traverseTree(p, []) == self.traverseTree(q, [])

    def traverseTree(self, tree, list1):
        if tree != None:
            list1.append(tree.val)
            self.traverseTree(tree.left, list1)
            self.traverseTree(tree.right, list1)
        else:
            list1.append(None)
        return list1
