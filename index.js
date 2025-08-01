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


class PriorityQueue {
    constructor() {
        this.items = [];
    }

    // Add an element to the queue based on priority
    enqueue(element, priority) {
        const qElement = { element, priority };
        let added = false;

        // Find the correct position to insert the element
        for (let i = 0; i < this.items.length; i++) {
            if (qElement.priority < this.items[i].priority) {
                this.items.splice(i, 0, qElement);
                added = true;
                break;
            }
        }

        // If it's the lowest priority, add to the end
        if (!added) {
            this.items.push(qElement);
        }
    }

    // Remove and return the highest priority element
    dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        return this.items.shift().element;
    }

    // Get the highest priority element without removing it
    peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.items[0].element;
    }

    // Check if the queue is empty
    isEmpty() {
        return this.items.length === 0;
    }
}
module.exports = maxScore;