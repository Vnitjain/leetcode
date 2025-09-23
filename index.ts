    class MinStack {
        private stack: number[];
        private minStack: number[];
        constructor() {
            this.stack = [];
            this.minStack = [];
        }

        push(val: number): void {
            this.stack.push(val);
            const topMin = this.topMinStack()
            if (topMin===undefined||val <= topMin)
                this.minStack.push(val);
        }

        pop(): void {
            const top = this.top();
            this.stack.pop()
            if (top === this.topMinStack())
                this.minStack.pop()
        }

        top(): number {
            return this.stack[this.stack.length - 1]
        }

        topMinStack(): number | undefined {
            if(this.minStack.length!==0)
                return this.minStack[this.minStack.length - 1];
            else 
                return undefined;
        }

        getMin(): number {
            return this.minStack[this.minStack.length - 1];
        }
    }
