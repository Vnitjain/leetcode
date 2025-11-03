# 🐒 Koko Eating Bananas — Detailed Solution Explanation

## 🧩 Problem Overview

Koko loves to eat bananas. She has multiple piles of bananas, and she can choose her eating speed `k` (bananas per hour).  
Each hour, she can eat from **one** pile — either `k` bananas, or the rest of that pile if it has fewer than `k`.  

The guards will return after `h` hours, and she wants to finish *all* the bananas before then, but as **slowly** as possible.

We need to find the **minimum integer speed `k`** that allows Koko to finish all piles within `h` hours.

---

## 🧠 Approach

This is a **binary search on the answer** type of problem.  
We’re not searching through the piles — we’re searching for the *minimum eating speed* that satisfies the time limit.

### Step 1: Define the Search Range

- The **slowest** Koko can go is `1` banana/hour (`left = 1`).
- The **fastest** she’ll ever need to go is the largest pile (`right = max(piles)`),  
  since at that speed she can clear even the biggest pile in one hour.

### Step 2: Binary Search Logic

We perform a binary search between `left` and `right`.

1. Pick a middle speed `mid = floor((right - left) / 2) + left`.
2. Compute how many hours it would take Koko to eat all bananas at that speed.
3. If she can finish **within** `h` hours, try a smaller speed (search left half).
4. If she cannot finish, she needs to go faster (search right half).

We keep track of the **smallest valid speed** encountered.

### Step 3: Checking Feasibility

To compute total hours needed for a given speed `k`:

For each pile:
```
hours += ceil(pile / k)
```

That’s the number of hours needed to finish that pile.

If total hours ≤ `h`, then speed `k` is *fast enough* (feasible).  
Otherwise, it’s too slow.

---

## 🧾 Final TypeScript Code

```ts
export function minEatingSpeed(piles: number[], h: number): number {
  let left = 1;
  let right = Math.max(...piles);
  let lowestK = right;

  while (left <= right) {
    const mid = Math.floor((right - left) / 2) + left;
    let hourCount = 0;

    for (const pile of piles) {
      hourCount += Math.ceil(pile / mid);
    }

    if (hourCount <= h) {
      lowestK = mid;       // possible answer
      right = mid - 1;     // try smaller k
    } else {
      left = mid + 1;      // too slow
    }
  }

  return lowestK;
}
```

---

## 🧮 Example Walkthrough

### Example 1

```
piles = [3, 6, 7, 11], h = 8
```

| Speed (k) | Total Hours | Decision |
|------------|--------------|-----------|
| 6 | 6 | try slower |
| 3 | 10 | too slow |
| 4 | 8 | ✅ feasible |

✅ Minimum speed = **4**

---

### Example 2

```
piles = [30, 11, 23, 4, 20], h = 6
```

| Speed (k) | Total Hours | Decision |
|------------|--------------|-----------|
| 15 | 8 | too slow |
| 23 | 6 | ✅ feasible |
| 19 | 7 | too slow |

✅ Minimum speed = **23**

---

## ⚙️ Time & Space Complexity

- **Time:** `O(n log m)`  
  - `n` = number of piles  
  - `m` = max pile size  
  - Binary search runs in `log m` steps, each check costs `O(n)`.
- **Space:** `O(1)` (constant extra space)

---

## 💡 Key Insights

- Binary search can be used even when we’re not searching an array — as long as the answer space is *monotonic* (if a certain `k` works, all larger `k` also work).
- The feasibility function is the heart of this problem.
- Always track the **smallest valid** `k`, not just the first that works.

---

## ✅ Example Output Check

| Input | Output |
|--------|--------|
| [3,6,7,11], h=8 | 4 |
| [30,11,23,4,20], h=5 | 30 |
| [30,11,23,4,20], h=6 | 23 |

---

## 🧩 Summary

- Use binary search on speed `k`
- Simulate hours using `ceil(pile / k)`
- Shrink search space based on feasibility
- Return the smallest valid `k`

---

**Author:** ChatGPT (LeetCode Coaching Mode)  
**Language:** TypeScript  
**Difficulty:** Medium  
**Concepts:** Binary Search, Greedy Simulation  
