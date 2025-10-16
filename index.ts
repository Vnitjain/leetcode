function carFleet(target: number, position: number[], speed: number[]): number {
  let inputMap: number[][] = [];
  for (let i = 0; i < position.length; i++) {
    inputMap.push([position[i], speed[i], (target - position[i]) / speed[i]]);
  }
  inputMap.sort((a, b) => b[0] - a[0]);
  let maxNumber: number = 0;
  let count: number = 0;
  for (let i = 0; i < inputMap.length; i++) {
    let curr = inputMap[i][2];
    if (curr > maxNumber) {
      maxNumber = curr;
      count++;
    }
  }
  return count;
}
let target = 12,
  position = [10, 8, 0, 5, 3],
  speed = [2, 4, 1, 1, 3];
console.log(carFleet(target, position, speed));
