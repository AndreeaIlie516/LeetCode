package gosolutions

func bSearch(nums []int, left int, right int, target int) int {
	if left > right {
		return left
	}
	mid := (left + right) / 2
	if target < nums[mid] {
		return bSearch(nums, left, mid-1, target)
	} else if target > nums[mid] {
		return bSearch(nums, mid+1, right, target)
	}
	return mid
}

func searchInsert(nums []int, target int) int {
	return bSearch(nums, 0, len(nums)-1, target)
}
