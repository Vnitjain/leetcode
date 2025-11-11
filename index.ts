function guessNumber(n: number): number {
  let i = 1, j = n;
  while (i < j) {
    let myGuess = Math.floor((j - i) / 2) + i;
    let direction = guess(myGuess);
    if (direction === -1) {
      j = myGuess - 1;
    } else if (direction === 1) {
      i = myGuess + 1;
    } else if (direction === 0) {
      return myGuess;
    }
  }
  return i;
};