class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val noOfElems = matrix.size * matrix[0].size
        val result = mutableListOf<Int>()

        var lastRow = matrix.size - 1
        var lastCol = matrix[0].size - 1
        
        var rowStart = 0
        var colStart = 0

        var i = 0
        var j = 0
        
        while(result.size < noOfElems) {
            i = rowStart
            j = colStart
            while(j <= lastCol) {
                result.add(matrix[i][j])
                j++
            }
            j--
            i++
            while (i <= lastRow) {
                result.add(matrix[i][j])
                i++
            }
            i = lastRow
            j = lastCol - 1
            lastRow--
            lastCol--
            rowStart++
            if (result.size == noOfElems) {
                return result
            }
            while (j >= colStart) {
                result.add(matrix[i][j])
                j--
            }
            j++
            i--
            while (i >= rowStart) {
                result.add(matrix[i][j])
                i--
            }
            
            colStart++
        }
        return result
    }
}