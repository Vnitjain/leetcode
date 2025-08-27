function minFlips(target: string): number {
  let resCount = 0;
  let currDigit = "0";
  for (let i = 0; i < target.length; i++) {
    if (currDigit !== target.charAt(i)) {
      currDigit = currDigit === "0" ? "1" : "0";
      resCount++;
    }
  }
  return resCount;
}
