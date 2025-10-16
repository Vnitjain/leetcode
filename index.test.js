"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const index_1 = require("./index"); // Assuming your 3Sum function is in index.ts
describe("threeSum", () => {
    it("should return all unique triplets that sum to zero", () => {
        const nums = [-1, 0, 1, 2, -1, -4];
        const expected = [
            [-1, -1, 2],
            [-1, 0, 1],
        ];
        // Sort both the output and expected for consistent comparison
        const result = (0, index_1.threeSum)(nums)
            .map((arr) => arr.sort((a, b) => a - b))
            .sort((a, b) => a[0] - b[0] || a[1] - b[1] || a[2] - b[2]);
        expect(result).toEqual(expected);
    });
    it("should return an empty array if no triplets sum to zero", () => {
        const nums = [0, 1, 1];
        expect((0, index_1.threeSum)(nums)).toEqual([]);
    });
    it("should handle an array with all zeros", () => {
        const nums = [0, 0, 0];
        expect((0, index_1.threeSum)(nums)).toEqual([[0, 0, 0]]);
    });
    it("should handle duplicate numbers correctly", () => {
        const nums = [-2, 0, 0, 2, 2];
        const expected = [[-2, 0, 2]];
        const result = (0, index_1.threeSum)(nums)
            .map((arr) => arr.sort((a, b) => a - b))
            .sort((a, b) => a[0] - b[0] || a[1] - b[1] || a[2] - b[2]);
        expect(result).toEqual(expected);
    });
    it("should return an empty array for an empty input array", () => {
        const nums = [];
        expect((0, index_1.threeSum)(nums)).toEqual([]);
    });
    it("should return an empty array for an array with less than 3 elements", () => {
        const nums = [1, 2];
        expect((0, index_1.threeSum)(nums)).toEqual([]);
    });
    it("should handle a larger array with multiple solutions", () => {
        const nums = [-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6];
        const expected = [
            [-4, -2, 6],
            [-4, 0, 4],
            [-4, 1, 3],
            [-4, 2, 2],
            [-2, -2, 4],
            [-2, 0, 2],
        ];
        const result = (0, index_1.threeSum)(nums)
            .map((arr) => arr.sort((a, b) => a - b))
            .sort((a, b) => a[0] - b[0] || a[1] - b[1] || a[2] - b[2]);
        expect(result).toEqual(expected);
    });
});
