export function searchMatrix(matrix: number[][], target: number): boolean {
  let rows = matrix.length,
    columns = matrix[0].length;
  let length = rows * columns;

  let i = 0,
    j = length - 1;
  while (i <= j) {
    const mid = Math.floor((j - i) / 2) + i;
    let coords = convertToCoords(mid, rows, columns);
    if (matrix[coords.x][coords.y] === target) {
      return true;
    } else if (matrix[coords.x][coords.y] < target) {
      i = mid + 1;
    } else {
      j = mid - 1;
    }
  }
  return false;
}

export function convertToCoords(
  index: number,
  rows: number,
  columns: number,
): { x: number; y: number } {
  return { x: Math.floor(index / columns), y: index % columns };
}
