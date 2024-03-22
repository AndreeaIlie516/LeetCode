class Solution:
    def climbStairs(self, n: int) -> int:
        if (n <= 1):
            return 1
        waysPerStair = []
        waysPerStair.append(1)
        waysPerStair.append(1)
        for i in range(2, n+1):
            waysPerStair.append(0)

        for i in range(2, n+1):
            waysPerStair[i] = waysPerStair[i-1] + waysPerStair[i-2]

        return waysPerStair[n]
        
