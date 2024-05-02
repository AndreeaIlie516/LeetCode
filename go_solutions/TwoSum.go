package go_solutions

func twoSum(nums []int, target int) []int {
	m := make(map[int]int)

	for index, elem := range nums {
		complement := target - elem
		if elem, exists := m[complement]; exists {
			return []int{index, elem}
		}
		m[elem] = index
	}
	return []int{}
}
