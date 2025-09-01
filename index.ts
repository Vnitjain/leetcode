function sortedSquares(nums: number[]): number[] {
    let i = 0;
    const stack: number[] = [];
    let finalResult: number[] = [];
    while (nums[i] < 0 && i < nums.length) {
        stack.push(nums[i] * nums[i]);
        i++;
    }
    while (i < nums.length && stack.length !== 0) {
        const currentSquare = nums[i] * nums[i]
        if (stack[stack.length - 1] < currentSquare) {
            const poppedVal = stack.pop()
            if (poppedVal)
                finalResult.push(poppedVal)
        }
        else {
            finalResult.push(currentSquare)
            i++;
        }
    }
    while (stack.length !== 0) {
        const poppedValue = stack.pop()
        if (poppedValue !== undefined)
            finalResult.push(poppedValue)
    }
    while (i < nums.length) {
        finalResult.push(nums[i] * nums[i]);
        i++;
    }
    return finalResult
};
sortedSquares([-4, -1, 0, 3, 10])