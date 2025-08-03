package my.leetcode;

import java.util.List;
import java.util.Optional;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traverseTree(root,p,q);
    }
    private TreeNode traverseTree(TreeNode currNode, TreeNode p,TreeNode q){
        if(currNode==null)
            return currNode;
        if(currNode.val==p.val || currNode.val==q.val)
            return currNode;
        TreeNode leftNode = traverseTree(currNode.left,p,q);
        TreeNode rightNode = traverseTree(currNode.right,p,q);
        if(leftNode!=null&&rightNode!=null){
            return currNode;
        } else if (leftNode!=null) {
            return leftNode;
        }else if (rightNode!=null){
            return rightNode;
        } else return null;
    }
}

