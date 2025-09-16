function isValidSudoku(board: string[][]): boolean {
    const rows = Array.from({ length: 9 }, () => Array(9).fill(0));
    const columns = Array.from({ length: 9 }, () => Array(9).fill(0));

    for (let blockRow = 0; blockRow < 3; blockRow++) {
        for (let blockColumn = 0; blockColumn < 3; blockColumn++) {
            const blockNums = new Array<number>(9).fill(0);
            for (let i = 0; i < 3; i++) {
                for (let j = 0; j < 3; j++) {
                    const currNum = board[blockRow * 3 + i][blockColumn * 3 + j]
                    if (currNum !== '.') {
                        const curr = parseInt(currNum)
                        if (blockNums[curr] === 1) {
                            return false;
                        } else {
                            blockNums[curr] = 1;
                        }
                        if (rows[blockRow * 3 + i][curr] === 1) {
                            return false;
                        } else {
                            rows[blockRow * 3 + i][curr] = 1;
                        }
                        if (columns[blockColumn * 3 + j][curr] === 1) {
                            return false;
                        } else {
                            columns[blockColumn * 3 + j][curr] = 1;
                        }
                    }

                }
            }
        }
    }
    return true;

};

isValidSudoku([["5", "3", ".", ".", "7", ".", ".", ".", "."]
    , ["6", ".", ".", "1", "9", "5", ".", ".", "."]
    , [".", "9", "8", ".", ".", ".", ".", "6", "."]
    , ["8", ".", ".", ".", "6", ".", ".", ".", "3"]
    , ["4", ".", ".", "8", ".", "3", ".", ".", "1"]
    , ["7", ".", ".", ".", "2", ".", ".", ".", "6"]
    , [".", "6", ".", ".", ".", ".", "2", "8", "."]
    , [".", ".", ".", "4", "1", "9", ".", ".", "5"]
    , [".", ".", ".", ".", "8", ".", ".", "7", "9"]])