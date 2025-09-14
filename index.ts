
// max-heap.ts
type Comparator<T> = (a: T, b: T) => number; // >0 if a>b

class MaxHeap1<T> {
    private a: T[] = [];
    private cmp: Comparator<T>;

    constructor(cmp?: Comparator<T>, items?: Iterable<T>) {
        this.cmp = cmp ?? ((x: any, y: any) => (x > y ? 1 : x < y ? -1 : 0));
        if (items) {
            this.a = Array.from(items);
            this.heapify();
        }
    }

    size(): number { return this.a.length; }
    isEmpty(): boolean { return this.a.length === 0; }
    peek(): T | undefined { return this.a[0]; }

    push(...values: T[]): number {
        for (const v of values) {
            this.a.push(v);
            this.siftUp(this.a.length - 1);
        }
        return this.a.length;
    }

    pop(): T | undefined {
        const n = this.a.length;
        if (n === 0) return undefined;
        const top = this.a[0];
        const last = this.a.pop() as T;
        if (n > 1) {
            this.a[0] = last;
            this.siftDown(0);
        }
        return top;
    }

    replaceTop(value: T): T | undefined {
        if (this.a.length === 0) { this.a.push(value); return undefined; }
        const top = this.a[0];
        this.a[0] = value;
        this.siftDown(0);
        return top;
    }

    clear(): void { this.a.length = 0; }

    static from<U>(items: Iterable<U>, cmp?: Comparator<U>): MaxHeap1<U> {
        return new MaxHeap1(cmp, items);
    }

    // ---- internals ----
    private heapify(): void {
        for (let i = (this.a.length >> 1) - 1; i >= 0; i--) this.siftDown(i);
    }
    private siftUp(i: number): void {
        const a = this.a, cmp = this.cmp;
        while (i > 0) {
            const p = (i - 1) >> 1;
            if (cmp(a[i], a[p]) <= 0) break;
            [a[i], a[p]] = [a[p], a[i]];
            i = p;
        }
    }
    private siftDown(i: number): void {
        const a = this.a, cmp = this.cmp, n = a.length;
        while (true) {
            const l = (i << 1) + 1, r = l + 1;
            if (l >= n) break;
            let best = l;
            if (r < n && cmp(a[r], a[l]) > 0) best = r;
            if (cmp(a[best], a[i]) <= 0) break;
            [a[i], a[best]] = [a[best], a[i]];
            i = best;
        }
    }
}
type Element1 = {
    integer: number,
    freq: number
}

function topKFrequent(nums: number[], k: number): number[] {
    const map = new Map<number, number>();
    for (const num of nums)
        map.set(num, (map.get(num) ?? 0) + 1);

    const heap = new MaxHeap1<Element1>((a, b) => a.freq - b.freq);
    for (const key of map.keys()) {
        heap.push({ integer: key, freq: map.get(key) ?? 0 })
    }

    const result: number[] = [];
    for (let i = 0; i < k; i++)
        result.push(heap.pop()?.integer || 0)
    return result;
};

