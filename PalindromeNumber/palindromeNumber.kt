class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) {
            return false
        }
        if(x in 0..9) {
            return true
        }
        
        var aux = x
        var reverse = 0
        while(aux != 0) {
            reverse = reverse * 10 + aux % 10
            aux = aux / 10
        }
        return x == reverse
    }
}