function calPoints(operations: string[]): number {
  let scores: number[] = [];
  for (let op of operations) {
    if (op === "+") {
      if (scores.length >= 2) {
        let lastScore = scores[scores.length - 1];
        let secondLastScore = scores[scores.length - 2];
        scores.push(lastScore + secondLastScore);
      }
    } else if (op === "D") {
      if (scores.length >= 1) {
        let lastScore = scores[scores.length - 1];
        scores.push(lastScore * 2);
      }
    } else if (op === "C") {
      if (scores.length >= 1) {
        scores.pop();
      }
    } else {
      scores.push(parseInt(op));
    }
  }
  return scores.reduce((acc, curr) => acc + curr, 0);
}
