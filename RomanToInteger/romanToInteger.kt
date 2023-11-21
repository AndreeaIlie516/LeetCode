class Solution {
    fun romanToInt(s: String): Int {
        val romanValues = mapOf(
            'I' to 1, 
            'V' to 5, 
            'X' to 10, 
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
            )

        var intValue = 0
        var i = 0
        var currentValue = 0
        var nextValue = 0

        
        while (i < s.length) {
            currentValue = romanValues[s[i]] ?: 0
           
            if(i < s.length - 1){
                nextValue = romanValues[s[i+1]] ?: 0
                if (currentValue < nextValue){
                    intValue += nextValue - currentValue
                    i+=2
                }
                else {
                    intValue += currentValue
                    i++
                }
            }
            else {
                intValue += currentValue
                    i++
            }
        }
        return intValue
    }
}