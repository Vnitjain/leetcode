package main

func main() {

}

func differenceOfSum(nums []int) int {
	sum := 0
	for i := 0; i < len(nums); i++ {
		sum += nums[i]
		for nums[i] != 0 {
			sum -= nums[i] % 10
			nums[i] /= 10
		}
	}
	return sum
}
