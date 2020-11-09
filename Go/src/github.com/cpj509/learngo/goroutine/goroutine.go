package goroutine

import (
	"fmt"
	"time"
)

// PracticeGo is practice go routine.
func PracticeGo() {
	// c := make(chan bool)
	c := make(chan string)
	people := []string{"nico", "flynn", "pj"}
	for _, person := range people {
		go isSexy(person, c)

	}
	for i := 0; i < len(people); i++ {
		fmt.Println("waiting for", i)
		fmt.Println(<-c)
	}
	// fmt.Println("waiting....")
	// fmt.Println("Recieved this message:", <-c)
	// fmt.Println("Recieved this message:", <-c)
}

// func sexyCount(person string) {
// 	for i := 0; i < 10; i++ {
// 		fmt.Println(person, "is sexy", i)
// 		time.Sleep(time.Second)
// 	}
// }

func isSexy(person string, c chan string) {
	time.Sleep(time.Second * 2)
	// fmt.Println(person)
	// c <- true
	c <- person + " is sexy"
}
