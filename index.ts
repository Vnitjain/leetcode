function groupAnagrams(strs: string[]): string[][] {
  const map = new Map<string, string[]>();
  for (const str of strs) {
    const sorted = str.split("").sort().join("");
    if (map.has(sorted)) {
      map.get(sorted)?.push(str)
    } else {
      map.set(sorted, [str])
    }
  }
  const result: string[][] = [];
  for (const value of map.values()) {
    result.push(value);
  }
  return result;
};

groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])