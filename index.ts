class TreeNode {
    val: number
    left: TreeNode | null
    right: TreeNode | null
    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val === undefined ? 0 : val)
        this.left = (left === undefined ? null : left)
        this.right = (right === undefined ? null : right)
    }
}

function traverseNodes(root: TreeNode | null, currentLevel: number, levelSumArr: number[]): void {
    if (root === null)
        return;

    levelSumArr[currentLevel] = levelSumArr[currentLevel] ? levelSumArr[currentLevel] + root.val : root.val;

    traverseNodes(root.left, currentLevel + 1, levelSumArr);
    traverseNodes(root.right, currentLevel + 1, levelSumArr);
}

function maxLevelSum(root: TreeNode | null): number {
    const levelSumArr: number[] = [];
    if (root === null)
        return -1;
    let maxValue = root?.val;
    let maxKey = 1;
    traverseNodes(root, 1, levelSumArr);
    for (const [index, value] of levelSumArr.entries()) {
        if (value > maxValue) {
            maxValue = value;
            maxKey = index;
        }
    }
    return maxKey;
}

