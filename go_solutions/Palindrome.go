package gosolutions

func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	mirror := 0
	copy := x
	for ; copy != 0; copy = copy / 10 {
		mirror = mirror*10 + copy%10
	}
	return mirror == x
}
