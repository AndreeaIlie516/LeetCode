class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var i = 0
        val map = mutableMapOf<Int,Int>()
        while (i < nums.size) {
            val valueToCheck = target - nums[i]
            if (valueToCheck in map) {
                return intArrayOf(map[valueToCheck]!!, i)
            }
            map[nums[i]] = i
            i++
        }
        return intArrayOf(0)
    }
}