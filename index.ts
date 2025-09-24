function evalRPN(tokens: string[]): number {
    const stack: number[] = [];
    const operators = new Set(["+", "-", "*", "/"]);

    for (const token of tokens) {
        if (operators.has(token)) {
            if (stack.length < 2) {
                return -1;
            }
            const operand2 = stack.pop()!;
            const operand1 = stack.pop()!;

            switch (token) {
                case "+":
                    stack.push(operand1 + operand2);
                    break;
                case "-":
                    stack.push(operand1 - operand2);
                    break;
                case "*":
                    stack.push(operand1 * operand2);
                    break;
                case "/":
                    stack.push(Math.trunc(operand1 / operand2));
                    break;
            }
        } else {
            const num = Number(token);
            if (isNaN(num)) {
                throw new Error(`Invalid token: ${token}`);
            }
            stack.push(num);
        }
    }

    if (stack.length !== 1) {
       return -1
    }
    return stack[0];
}