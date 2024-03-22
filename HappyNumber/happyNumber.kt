class Solution {
    fun isHappy(n: Int): Boolean {
        if (n == 1) {
            return true
        }

        var nCopy = n

        val seen = mutableSetOf<Int>()
        while (nCopy != 1 && !seen.contains(nCopy)) {
            seen.add(nCopy)
            nCopy = getNext(nCopy)
        }
        return nCopy==1
    }

    fun getNext(n: Int): Int {
        var sum = 0
        var digit = 0
        var nCopy = n
        while (nCopy > 0) {
            digit = nCopy % 10
            sum += digit * digit
            nCopy = nCopy / 10
        }
        return sum
    }
}