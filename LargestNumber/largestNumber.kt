class Solution {
    fun largestNumber(nums: IntArray): String {
        val asStrs = nums.map { it.toString() }

        val comparator = Comparator { a: String, b: String -> (b + a).compareTo(a + b) }
        val sorted = asStrs.sortedWith(comparator)

        if (sorted[0] == "0") {
            return "0"
        }

        return sorted.joinToString("")
    }
}