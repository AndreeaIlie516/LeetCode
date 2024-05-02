package gosolutions

func lengthOfLongestSubstring(s string) int {
	result := 0
	start := 0
	for end := 0; end < len(s); end++ {
		currStr := s[start : end+1]
		if checkSubstr(currStr) {
			result = max(result, end-start+1)
		} else {
			start++
		}
	}
	return result
}

func checkSubstr(s string) bool {
	m := make(map[rune]int)
	for _, ch := range s {
		m[ch]++
	}
	for _, count := range m {
		if count > 1 {
			return false
		}
	}
	return true
}
