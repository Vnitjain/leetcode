class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    levels = {}
    deepest = -1
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        self.traverseTree(root,0)
        return [self.levels[x] for x in range(self.deepest+1)]
    def traverseTree(self, root,level):
        if root is None:
            return
        if(level>self.deepest):
            self.deepest = level
        self.levels[level] = root.val
        self.traverseTree(root.left,level+1)
        self.traverseTree(root.right,level+1)



