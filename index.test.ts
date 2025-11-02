import { convertToCoords, searchMatrix } from ".";

describe("searchMatrix function", () => {
  test("example 1", () => {
    expect(
      searchMatrix(
        [
          [1, 3, 5, 7],
          [10, 11, 16, 20],
          [23, 30, 34, 60],
        ],
        3,
      ),
    ).toBe(true);
  });
  test("example 2", () => {
    expect(
      searchMatrix(
        [
          [1, 3, 5, 7],
          [10, 11, 16, 20],
          [23, 30, 34, 60],
        ],
        13,
      ),
    ).toBe(false);
  });
});

describe("convertToCoords Function", () => {
  test("example 1", () => {
    expect(convertToCoords(5, 3, 4)).toStrictEqual({ x: 1, y: 1 });
  });
  test("example 2", () => {
    expect(convertToCoords(11, 3, 4)).toStrictEqual({ x: 2, y: 3 });
  });
});
