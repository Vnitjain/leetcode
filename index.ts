function kthPalindrome(queries: number[], intLength: number): number[] {
    if (intLength === 0) return queries.map(q => -1);

    let init = 10 ** (intLength - 1);
    if (init !== 1) init++;

    const initString = init.toString(10);
    let endOfFirstHalfIndex = Math.floor(intLength / 2 + 0.5);
    const halfInitString = initString.slice(0, endOfFirstHalfIndex);

    function getNthPalindrome(index: number) {
        const nextHalfStr = (+halfInitString + index - 1).toString(10);
        if (nextHalfStr.length > halfInitString.length) return -1;
        const res = [];
        for (let i = 0, j = intLength - 1; i <= j; i++, j--) {
            res[i] = nextHalfStr[i];
            res[j] = res[i];
        }
        return +res.join('');
    }

    return queries.map(getNthPalindrome);
};