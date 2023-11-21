class Solution:
    def superPow(self, a: int, b: List[int]) -> int:
        MOD = 1337

        def powmod(base, exponent):
            result = 1
            while exponent > 0:
                if exponent % 2 == 1:
                    result = (result * base) % MOD

                base = (base * base) % MOD
                exponent //= 2
            return result

        result = 1
        for digit in b:
            result = powmod(result, 10) * powmod(a, digit) % MOD

        return result
