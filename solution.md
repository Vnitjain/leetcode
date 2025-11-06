# 🧩 LeetCode Problem

## 📝 Problem
**Title:**  661. Image Smoother

**Link:**  https://leetcode.com/problems/image-smoother/description/

---

## 🧠 Approach / Strategy
### Brute force
The idea is just to iterate through each value in the matrix and then iterate through the neighbouring values to find the average and then place it in a new matrix which produces a smoother image. Here a lot of the computations are overlapping. At first i thought of storing the sum for each row and column in a separate list and then add and remove terms as we go ahead kinda like sliding window. But the issue is that the window would be reset every new row/column, not really optimal approach. Optimal approach should be something else.

### Optimal approach
There is a hint that the optimal approach involves getting a sum of range of matrix quickly which is similar to a prefix problem where we use the sum till the term and subtract all the previous terms to get an sum of the range in O(n) time. So thats the same intuition here as well. This is different because we are doing this in 2d matrix and not 1d.

In 1D
$$Current Prefix\ =\ PreviousPrefix\ +\ Current\ Element\ from\ array$$

In 2D
$$Current\ Prefix\ =\ Previous\ Left\ Prefix\ +\ Previous\ Top\ Prefix\ +\ Current\ Element\ From\ Array$$

---

## ⏱️ Complexity Analysis
| Metric | Complexity | Explanation |
|--------|-------------|--------------|
| **Time** | O(...) |  |
| **Space** | O(...) |  |

---

## 🧪 Example Walkthrough
Use a small example and simulate your logic manually:

**Example Input:**  
**Example Output:**  
**Walkthrough:**
```
Step 1: ...
Step 2: ...
Final Output: ...
```

---

## 💻 Code (in your language)
\`\`\`java
// your code here
\`\`\`

---

## 🧩 Edge Cases / Gotchas
- ...
- ...
- Example cases that failed before you fixed your code.

---

## 🔁 Alternative Approaches
- Any other ways to solve it (e.g., prefix sum, sliding window, etc.)
- When would you prefer those alternatives?

---

## 🔑 Key Takeaways
- What concept did you learn or reinforce?  
- What’s the *pattern* or *category* this belongs to? (e.g., “matrix traversal”, “dynamic programming - 1D state”)  
- How would you recognize a similar problem in the future?

---

## ⭐ Rating (Optional)
| Category | Rating (1–5) |
|-----------|---------------|
| Difficulty |  |
| Importance |  |
| Reusability of Concept |  |
