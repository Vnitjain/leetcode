export function minimumSumSubarray(
  nums: number[],
  l: number,
  r: number,
): number {
  let minimum = Number.MAX_SAFE_INTEGER;
  let prefix = new Array<number>(nums.length + 1).fill(0);

  for (let i = 1; i < prefix.length; i++)
    prefix[i] = prefix[i - 1] + nums[i - 1];

  let i = 0;

  while (i < nums.length) {
    for (let j = l; j <= r && j + i <= nums.length; j++) {
      let curr = prefix[j + i] - prefix[i];
      if (curr > 0) minimum = Math.min(curr, minimum);
    }
    i++;
  }
  return minimum === Number.MAX_SAFE_INTEGER ? -1 : minimum;
}
