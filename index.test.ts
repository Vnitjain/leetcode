import { minimumSumSubarray } from "./index";

describe("Testing", () => {
  test("example 1", () => {
    let nums = [3, -2, 1, 4],
      l = 2,
      r = 3;
    expect(minimumSumSubarray(nums, l, r)).toBe(1);
  });
  test("example 2", () => {
    let nums = [-2, 2, -3, 1],
      l = 2,
      r = 3;
    expect(minimumSumSubarray(nums, l, r)).toBe(-1);
  });
  test("example 3", () => {
    let nums = [1, 2, 3, 4],
      l = 2,
      r = 4;
    expect(minimumSumSubarray(nums, l, r)).toBe(3);
  });
  test("example 4", () => {
    let nums = [4, -10],
      l = 1,
      r = 1;
    expect(minimumSumSubarray(nums, l, r)).toBe(4);
  });
});
