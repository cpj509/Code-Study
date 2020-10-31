// package main

// import (
// 	"fmt"

// 	"github.com/cpj509/learngo/mydict"
// )

// func main() {
// 	// make delete function
// 	dictionary := mydict.Dictionary{}
// 	baseWord := "hello"
// 	dictionary.Add(baseWord, "First")
// 	fmt.Println(dictionary)
// 	dictionary.Delete(baseWord)
// 	word, err := dictionary.Search(baseWord)
// 	if err != nil {
// 		fmt.Println(err)
// 	} else {
// 		fmt.Println(word)
// 	}

// 	// // make update function
// 	// dictionary := mydict.Dictionary{}
// 	// baseWord := "hello"
// 	// dictionary.Add(baseWord, "First")
// 	// fmt.Println(dictionary)
// 	// err := dictionary.Update(baseWord, "Second")
// 	// if err != nil {
// 	// 	fmt.Println(err)
// 	// }
// 	// word, _ := dictionary.Search(baseWord)
// 	// fmt.Println(word)

// 	// // make add function
// 	// dictionary := mydict.Dictionary{"first": "First word"}
// 	// word := "hello"
// 	// definition := "greeting"
// 	// err := dictionary.Add(word, definition)
// 	// if err != nil {
// 	// 	fmt.Println(err)
// 	// }
// 	// hello, _ := dictionary.Search(word)
// 	// fmt.Println("found", word, "definition:", hello)
// 	// err2 := dictionary.Add(word, definition)
// 	// if err2 != nil {
// 	// 	fmt.Println(err2)
// 	// }

// 	// // make search function
// 	// definition, err := dictionary.Search("second")
// 	// if err != nil {
// 	// 	fmt.Println(err)
// 	// } else {
// 	// 	fmt.Println(definition)
// 	// }
// }
