class Solution {
    fun isValid(s: String): Boolean {
        val parentheses = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )

        val stack = ArrayDeque<Char>()

        for (char in s) {
            val bracketInfo = parentheses[char]
            if(bracketInfo != null) {
                stack.addLast(bracketInfo)
            }
             else {
                if (stack.isEmpty() || stack.removeLast() != char) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}