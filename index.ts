class MinStack {
    private stack: number[];
    private minStack: number[];
    constructor() {
        this.stack = [];
        this.minStack = [];
    }

    push(val: number): void {
        this.stack.push(val);
        if (val < this.topMinStack())
            this.minStack.push(val);
    }

    pop(): void {
        const top = this.top();
        this.stack = this.stack.slice(0, this.stack.length - 1)
        if (top === this.topMinStack())
            this.minStack = this.minStack.slice(0, this.minStack.length - 1)
    }

    top(): number {
        return this.stack[this.stack.length - 1]
    }

    topMinStack(): number {
        return this.minStack[this.minStack.length - 1] ?? Number.MAX_SAFE_INTEGER;
    }

    getMin(): number {
        return this.topMinStack();
    }
}
