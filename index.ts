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

let deepest:number = -1;
let levels:Map<number,number> = new Map<number,number>();

function rightSideView(root: TreeNode | null): number[] {
    deepest = -1;
    levels = new Map<number,number>();
    traverseTree(root,0);
    let finalArr:number[] = [];
    for (let index = 0; index < deepest+1; index++) 
        finalArr.push(levels.get(index)||0);
    return finalArr;
    
};
function traverseTree(root:TreeNode|null,level:number):void{
    if(root===null)
        return;
    if(level>deepest)
        deepest=level;
    levels.set(level,root.val);
    traverseTree(root.left,level+1);
    traverseTree(root.right,level+1)
}