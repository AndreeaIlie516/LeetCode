package gosolutions

func longestCommonPrefix(strs []string) string {
	f := strs[0]
	for index, currChar := range f {
		for _, currStr := range strs {
			if index == len(currStr) {
				return f[0:index]
			}
			if currStr[index] != byte(currChar) {
				return f[0:index]
			}
		}
	}
	return f
}
