import { minEatingSpeed } from ".";

describe("Test cases", () => {
  test("example 1", () => {
    expect(minEatingSpeed([3, 6, 7, 11], 8)).toBe(4);
  });
  test("example 2", () => {
    expect(minEatingSpeed([30, 11, 23, 4, 20], 5)).toBe(30);
  });
  test("example 3", () => {
    expect(minEatingSpeed([312884470], 312884469)).toBe(2);
  });
  
});
