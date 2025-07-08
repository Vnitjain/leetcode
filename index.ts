class TreeNode {
      val: number
      left: TreeNode | null
      right: TreeNode | null
      constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
          this.val = (val===undefined ? 0 : val)
          this.left = (left===undefined ? null : left)
          this.right = (right===undefined ? null : right)
      }
  }

function traverseNodes(root:TreeNode|null,currentLevel:number,levelSum:Map<number,number>):void{
    if(root===null)
        return;

    levelSum.set(currentLevel,levelSum.has(currentLevel)?levelSum.get(currentLevel)+root.val:root.val);

    traverseNodes(root.left,currentLevel+1,levelSum);
    traverseNodes(root.right,currentLevel+1,levelSum);
}

function maxLevelSum(root: TreeNode | null): number {
    const levelSum:Map<number,number> = new Map<number, number>();
    let maxValue = root?.val;
    let maxKey = 1;
    traverseNodes(root,1,levelSum);
    for (const [key,value] of levelSum){
        if(value>maxValue) {
            maxValue = value;
            maxKey = key;
        }
    }
    return maxKey;
}

