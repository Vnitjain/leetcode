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

function invertTree(root: TreeNode | null): TreeNode | null {
  return root;
}

function traverseTree(root: TreeNode | null): TreeNode | null {
  if (root != null) {
    let temp = root.left;
    root.left = root.right;
    root.right = temp;

    root.left = traverseTree(root.left);
    root.right = traverseTree(root.right);

    return root;
  }
  return null;
}
