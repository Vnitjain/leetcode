function longestConsecutive(nums: number[]): number {
    if (nums.length === 0) return 0;
    nums = Array.from(new Set<number>(nums)).sort((a, b) => a - b);
    let final = 1;
    let i = 0, j = i + 1;
    while (j < nums.length) {
        while (nums[j] - 1 === nums[j - 1]) {
            j++;
        }
        final = Math.max(final, j - i)
        i = j;
        j = i + 1;
    }
    return final;
};
