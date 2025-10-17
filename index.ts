function differenceOfSums(n: number, m: number): number {
  let final: number = 0;
  for (let i = 1; i <= n; i++)
    if (i % m === 0) final -= i;
    else final += i;
  return final;
}
