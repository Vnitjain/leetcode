function triangleType(nums) {
    nums.sort((a, b) => b - a);
    if (nums[0] >= nums[1] + nums[2])
        return "none"
    let seen = new Set();
    for (let i = 0; i < 3; i++)
        seen.add(nums[i]);
    return seen.size == 3 ? "scalene" : seen.size == 2 ? "isosceles" : "equilateral";
}
