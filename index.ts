function longestConsecutive(nums: number[]): number {
    if (nums.length === 0) return 0;
    let set = new Set(nums);
    let final = 1;
    for (const num of set)
        if (!set.has(num - 1)) {
            let i = 1;
            while (set.has(num + i))
                i++;
            final = Math.max(final, i);
        }
    return final;
};
