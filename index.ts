function executeInstructions(
  n: number,
  startPos: number[],
  s: string,
): number[] {
  let result: number[] = [];
  for (let i = 0; i < s.length; i++) {
    let start = [...startPos], moveCount = 0;
    for (let j = i; j < s.length; j++) {
      const currMove = s.charAt(j);
      switch (currMove) {
        case 'R': start[1] += 1
          break;
        case 'D': start[0] += 1
          break;
        case 'L': start[1] -= 1
          break;
        case 'U': start[0] -= 1
          break;
      }
      if (start[0] >= n || start[0] <= -1 || start[1] >= n || start[1] <= -1)
        break
      moveCount++;
    }
    result.push(moveCount)
  }
  return result;
}


executeInstructions(3, [0, 1], "RRDDLU")