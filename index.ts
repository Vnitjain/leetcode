class TreeNode {
  val: number;
  left: TreeNode | null;
  right: TreeNode | null;
  constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
    this.val = val === undefined ? 0 : val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;
  }
}

function isBalanced(root: TreeNode | null): boolean {
  return depth(root) != -1;
}

function depth(currentNode: TreeNode | null): number {
  if (currentNode != null) {
    const leftDepth = depth(currentNode.left);
    if (leftDepth === -1) return -1;

    const rightDepth = depth(currentNode.right);
    if (rightDepth === -1) return -1;

    const difference = leftDepth - rightDepth;
    if (difference > 1 || difference < -1) return -1;
    return (rightDepth > leftDepth ? rightDepth : leftDepth) + 1;
  }
  return 0;
}
