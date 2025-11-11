class Solution:
    def findMinimumOperations(self, s1: str, s2: str, s3: str) -> int:
        minlength = min(len(s1),len(s2),len(s3))
        lens1,lens2,lens3 = len(s1),len(s2),len(s3)

        i=0
        sum=0
        while i<minlength:
            if s1[i]==s2[i]and s2[i]==s3[i]:
                i+=1
            else:
                break
        sum+=lens1-i
        sum+=lens2-i
        sum+=lens3-i
        if sum==lens1+lens2+lens3:
            return -1
        return sum


        