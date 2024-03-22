class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val sortedNums = nums.sortedArray()
        return nums.map { num -> sortedNums.indexOf(num) }.toIntArray()
    }
}