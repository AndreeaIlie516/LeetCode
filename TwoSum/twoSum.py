class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_of_x = {}
        len_of_nums = len(nums)
        i = 0
        while i < len_of_nums:
            value = target - nums[i]
            if value in dict_of_x:
                return [dict_of_x[value], i]
            dict_of_x[nums[i]] = i
            i += 1