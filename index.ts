export function search(nums: number[], target: number): number {
  let i = 0,
    j = nums.length;
  while (i < j) {
    let mid = Math.floor((j - i) / 2) + i;
    if (nums[mid] > target) j = mid;
    else if (nums[mid] < target) i = mid + 1;
    else if (nums[mid] === target) return mid;
  }
  return -1;
}
