function minimumMoves(s: string): number {
  let i = 0;
  let finalCount = 0;
  while (i < s.length) {
    if (s.charAt(i) === "X") {
      finalCount++;
      i += 3;
    } else {
      i++;
    }
  }
  return finalCount;
}
