package gosolutions

func isValid(s string) bool {
	var stack []rune
	m := map[rune]rune{
		'(': ')',
		'[': ']',
		'{': '}',
	}

	for _, ch := range s {
		switch ch {
		case '(', '[', '{':
			stack = append(stack, ch)
		case ')', ']', '}':
			if len(stack) == 0 || stack[len(stack)-1] != m[stack[len(stack)-1]] {
				return false
			}
			stack = stack[:len(stack)-1]
		}
	}
	return len(stack) == 0
}
