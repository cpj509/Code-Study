package main

import "fmt"

func main() {
	n := 3
	fmt.Println(solution(n))
}

func solution(n int) string {
	answer := ""
	for i := 0; i < n; i++ {
		if i%2 == 0 {
			answer += "수"
			continue
		}
		answer += "박"
	}
	return answer
}
