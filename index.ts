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

function inorderTraversal(root: TreeNode | null): number[] {
  return traverseTree(root);
}

function traverseTree(root: TreeNode | null): number[] {
  if (root != null) {
    let left = traverseTree(root.left);
    left.push(root.val);
    let right = traverseTree(root.right);
    return left.concat(right);
  }
  return [];
}
