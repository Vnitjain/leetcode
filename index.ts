function xorOperation(n: number, start: number): number {
  const list: number[] = [];
  while (n--) list.push(start + 2 * n);
  return list.reduce((a, b) => a ^ b);
}
let n = 5,
  start = 0;
xorOperation(n, start);
