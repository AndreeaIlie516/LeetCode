class Solution:
    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        f = []
        f.append(0)
        f.append(1)
        for i in range(2, n+1):
            f.append(0)

        for i in range(2, n+1):
            f[i] = f[i-1] + f[i-2]

        return f[n]
        