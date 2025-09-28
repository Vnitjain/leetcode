function generateParenthesis(n: number): string[] {
    let finalParenthesis: string[] = [];
    parenthesis("(", 1, 0, ["("], finalParenthesis, n);
    return finalParenthesis
};

function parenthesis(currString: string, leftCount: number, rightCount: number, stack: string[], finalParenthesis: string[], n: number): void {
    if (leftCount <= n && rightCount <= n) {
        if (stack.length === 0 && currString.length === n * 2)
            finalParenthesis.push(currString);
        parenthesis(currString + "(", leftCount + 1, rightCount, [...stack, "("], finalParenthesis, n)
        stack.pop()
        parenthesis(currString + ")", leftCount, rightCount + 1, [...stack], finalParenthesis, n)
    }
}

generateParenthesis(3)