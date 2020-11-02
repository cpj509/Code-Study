package main

import "fmt"

func main() {
	x := -4
	n := 2
	fmt.Println(solution(x, n))
}

func solution(x int, n int) []int {
	answer := []int{}
	temp := x
	for n > 0 {
		answer = append(answer, temp)
		temp += x
		n--
	}
	return answer
}
