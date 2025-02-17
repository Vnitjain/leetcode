"use strict";
function numTilePossibilities(tiles) {
    let finalList = new Set();
    traverseTiles("", finalList, tiles, new Array(tiles.length).fill(0));
    return finalList.size;
}
function traverseTiles(currentString, finalList, tiles, visited) {
    for (let i = 0; i < tiles.length; i++) {
        if (visited[i] === 0) {
            const newVisited = Array.from(visited);
            newVisited[i] = 1;
            const newString = currentString + tiles[i];
            finalList.add(newString);
            traverseTiles(newString, finalList, tiles, newVisited);
        }
    }
}
console.log(numTilePossibilities("AAB"));
