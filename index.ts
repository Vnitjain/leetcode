function generateParenthesis(n: number): string[] {
    let finalParenthesis: string[] = [];
    parenthesis("(", 1, 0, finalParenthesis, n);
    return finalParenthesis
};

function parenthesis(currString: string, leftCount: number, rightCount: number, finalParenthesis: string[], n: number): void {
    if (currString.length === n * 2)
        finalParenthesis.push(currString);
    if (leftCount < n)
        parenthesis(currString + "(", leftCount + 1, rightCount, finalParenthesis, n)
    if (rightCount < leftCount)
        parenthesis(currString + ")", leftCount, rightCount + 1, finalParenthesis, n)
}

generateParenthesis(3)