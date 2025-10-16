export function threeSum(nums: number[]): number[][] {
  let solution: number[][] = [];
  nums = nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;
    const current = nums[i];
    let j = i + 1,
      k = nums.length - 1;
    while (j < k) {
      const sum = current + nums[j] + nums[k];
      if (sum === 0) {
        solution.push([nums[i], nums[j], nums[k]]);
        j++;
        k--;
        while (j < k && nums[j] === nums[j - 1]) j++;
        while (j < k && nums[k] === nums[k + 1]) k--;
      } else if (sum < 0) {
        j++;
      } else {
        k--;
      }
    }
  }
  return solution;
}
