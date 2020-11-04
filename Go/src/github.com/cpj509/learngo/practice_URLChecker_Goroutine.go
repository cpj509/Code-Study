// //url checker using go routine
// package main

// import (
// 	"fmt"
// 	"net/http"
// )

// type requestResult struct {
// 	url    string
// 	status string
// }

// func main() {
// 	c := make(chan requestResult)
// 	var results = make(map[string]string)
// 	// results := map[string]string{} //위 코드와 같음
// 	urls := []string{
// 		"https://www.naver.com/",
// 		"https://www.daum.net/",
// 		"https://www.google.co.uk",
// 		"https://www.quora.com",
// 	}
// 	for _, url := range urls {
// 		go hitURL(url, c)
// 	}
// 	for i := 0; i < len(urls); i++ {
// 		result := <-c
// 		results[result.url] = result.status
// 		// fmt.Println(<-c)
// 	}
// 	for url, status := range results {
// 		fmt.Println(url, status)
// 	}
// }

// func hitURL(url string, c chan<- requestResult) {
// 	resp, err := http.Get(url)
// 	if err != nil || resp.StatusCode >= 400 { //status code는 0부터 100, 200, 300까지는 rediraction을 해주고 400부터는 문제가 있다는 뜻이여서 이렇게 함.
// 		fmt.Println(err, resp.StatusCode)
// 		c <- requestResult{url: url, status: "FAILED"}
// 	} else {
// 		c <- requestResult{url: url, status: "OK"}
// 	}
// }
