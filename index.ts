function winningPlayerCount(n: number, pick: number[][]): number {
  const players: number[][] = new Array(n)
    .fill(null)
    .map(() => new Array(11).fill(0));
  const seenPlayers: boolean[] = new Array(n).fill(false);
  let finalCount = 0;

  for (const [player, color] of pick) {
    if (!seenPlayers[player]) {
      players[player][color]++;
      if (players[player][color] > player) {
        finalCount++;
        seenPlayers[player] = true
      }
    }
  }
  return finalCount;
};

console.log(winningPlayerCount(4, [[0, 0], [1, 0], [1, 0], [2, 1], [2, 1], [2, 0]]))