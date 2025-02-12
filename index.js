var maximumSum = function (nums) {
  let max = -1;
  const count = new Map();
  for (const num of nums) {
    const digitSum = String(num)
      .split("")
      .reduce((acc, curr) => acc + parseInt(curr), 0);
    const prev = count.get(digitSum) ?? 0;
    if (count.get(digitSum)) {
      max = Math.max(prev + num, max);
    }
    count.set(digitSum, Math.max(prev, num));
  }
  return max;
};

console.log(maximumSum([18, 43, 36, 13, 7]));
