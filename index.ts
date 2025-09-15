function productExceptSelf(nums: number[]): number[] {
    const prefix = new Array<number>(nums.length);
    const postfix = new Array<number>(nums.length);

    for (let i = 0; i < nums.length; i++) {
        prefix[i] = (prefix[i - 1] ?? 1) * nums[i];
        postfix[postfix.length - 1 - i] = (postfix[nums.length - i] ?? 1) * nums[nums.length - 1 - i]
    }

    for (let i = 0; i < nums.length; i++) {
        nums[i] = ((prefix[i - 1] ?? 1) * (postfix[i + 1] ?? 1))
    }

    return nums;
};