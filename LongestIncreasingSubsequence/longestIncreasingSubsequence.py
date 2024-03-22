class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        maxLength = 0
        n = len(nums)

        partialSublists = [1] * n

        for i in range(1, n):
           for j in range(0, i):
               if nums[i] > nums[j]:
                   partialSublists[i] = max(partialSublists[i], partialSublists[j] + 1)


        return max(partialSublists)