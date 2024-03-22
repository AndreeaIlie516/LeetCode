class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return 0
        
        if n == 1:
            return nums[0]

        if n == 2: 
            return max(nums[0], nums[1])

        def rob(nums):

            n = len(nums)
            dp = [0] * n
            dp[0] = int(nums[0])
            dp[1] = int(nums[1])

            for i in range(2, n):
                if i > 2:
                    dp[i] = int(nums[i]) + max(dp[i-2], dp[i-3])
                else:
                    dp[i] = int(nums[i]) + dp[i-2]
            return dp

        return max(max(rob(nums[1:])), max(rob(nums[:-1])))