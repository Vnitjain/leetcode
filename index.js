function miniMaxSum(arr) {
  let minMax = [Number.MAX_SAFE_INTEGER, Number.MIN_SAFE_INTEGER];
  for (let i = 0; i < arr.length; i++) {
    let j = i;
    let sum = 0;
    let count = 0;
    while (count < 4) {
      sum += arr[j];
      j = (j + 1) % arr.length;
      count++;
    }
    minMax[0] = Math.min(minMax[0], sum);
    minMax[1] = Math.max(minMax[1], sum);
  }
  console.log(minMax[0] + " " + minMax[1]);
}

console.log(miniMaxSum([1, 3, 5, 7, 9]));
