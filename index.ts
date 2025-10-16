function twoSum(numbers: number[], target: number): number[] {
  if (numbers.length < 2) return [];
  let left = 0,
    right = numbers.length - 1;
  while (left < right) {
    const sum = numbers[left] + numbers[right];
    if (sum === target) return [left + 1, right + 1];
    else if (sum < target) left++;
    else right--;
  }
  return [left + 1, right + 1];
}

let numbers = [2, 7, 11, 15],
  target = 9;
twoSum(numbers, target);
