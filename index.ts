function licenseKeyFormatting(s: string, k: number): string {
  let resultString = "";
  let groupCount = 0;
  for (let i = s.length - 1; i >= 0; i--) {
    const currChar = s.charAt(i);
    if (groupCount >= k) {
      groupCount = 0;
      resultString = '-' + resultString;
    }
    if (currChar !== '-') {
      groupCount++;
      resultString = currChar.toUpperCase() + resultString;
    }
  }
  return resultString.replace(/^-/, '').replace(/-$/, '');
};


licenseKeyFormatting("5F3Z-2e-9-w", 4)