// //url checking topdown
// package URLChecker

// import (
// 	"errors"
// 	"fmt"
// 	"net/http"
// )

// var errRequestFailed = errors.New("Request fail.")

// func CheckURL() {
// 	var results = make(map[string]string)
// 	// results := map[string]string{} //위 코드와 같음
// 	urls := []string{
// 		"https://www.naver.com/",
// 		"https://www.daum.net/",
// 		"https://www.google.co.uk",
// 		"https://www.quora.com",
// 	}
// 	for _, url := range urls {
// 		result := "OK"
// 		err := hitURL(url)
// 		if err != nil {
// 			result = "FAILED"
// 		}
// 		results[url] = result
// 	}
// 	for url, result := range results {
// 		fmt.Println(url, result)
// 	}
// }

// func hitURL(url string) error {
// 	fmt.Println("Checking:", url)
// 	resp, err := http.Get(url)
// 	if err != nil || resp.StatusCode >= 400 { //status code는 0부터 100, 200, 300까지는 rediraction을 해주고 400부터는 문제가 있다는 뜻이여서 이렇게 함.
// 		fmt.Println(err, resp.StatusCode)
// 		return errRequestFailed
// 	}
// 	return nil

// }
