export function minEatingSpeed(piles: number[], h: number): number {
  let left = 1,
    right = Math.max(...piles);

  let lowestK = right;
  while (left <= right) {
    const mid = Math.floor((right - left) / 2) + left;
    let hourCount = 0;
    for (let i = 0; i < piles.length; i++) {
      hourCount += Math.ceil(piles[i] / mid);
    }
    if (hourCount <= h) {
      lowestK = mid
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }
  return lowestK;
}
