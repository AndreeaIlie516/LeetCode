class Solution:
    def rob(self, nums: List[int]) -> int:
        n= len(nums)

        if n == 0:
            return 0
        if n == 1:
            return nums[0]

        if n == 2:
            return max(nums[0], nums[1])

        dp = [0] * n

        for i in range(1, n):
            partialSum = 0
            for j in range(0, i-1):
                partialSum = nums[i] + max(nums[j], dp[j])
                if partialSum > dp[i]:
                    dp[i] = partialSum
            if partialSum == 0:
                if nums[i] > dp[i]:
                    dp[i] = nums[i]
        return max(dp)