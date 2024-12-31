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

function isSymmetric(root: TreeNode | null): boolean {
  if(root==null)
    return true;
  const isMirror = (n1, n2) => {
    if (!n1 && !n2) {
      return true;
    }

    if (!n1 || !n2) {
      return false;
    }

    return (
      n1.val === n2.val &&
      isMirror(n1.left, n2.right) &&
      isMirror(n1.right, n2.left)
    );
  };

  return isMirror(root.left, root.right);
}

// const root = new TreeNode(1);
// root.left = new TreeNode(2);
// root.right = new TreeNode(2);
// root.left.left = new TreeNode(3);
// root.left.right = new TreeNode(4);
// root.right.left = new TreeNode(4);
// root.right.right = new TreeNode(3);
// root.left.left.left = new TreeNode(1);
// root.left.left.left = new TreeNode(1);
// root.right.right.right = new TreeNode(1);
// console.log(isSymmetric(root));
