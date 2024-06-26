class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1
        if n < 0:
            n = -n
            x = 1 / x

        result = 1
        
        while n > 0:
            if n % 2:
                result *= x
            x *= x
            n//= 2
                
        return result
        