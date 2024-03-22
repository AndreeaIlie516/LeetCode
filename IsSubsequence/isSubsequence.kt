class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        if (t.isEmpty()) return false

        var indexInS = 0

        for (elem in t) {
            if(s[indexInS] == elem) {
                indexInS++
            }
            if (indexInS == s.length) {
                return true
            }
        }
        return indexInS == s.length
    }
}