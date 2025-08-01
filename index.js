var maxScore = function (nums) {
    nums.sort((a, b) => b - a);
    let lastSum = 0;
    let count = 0;
    for (const num of nums) {
        let newSum = num + lastSum;
        if (newSum > 0)
            count++;
        lastSum = newSum;
    }

    return count;
};
module.exports = maxScore;