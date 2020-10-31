// package main

// import "fmt"

// //12.struct
// type person struct {
// 	name    string
// 	age     int
// 	favFood []string
// }

// func main() {
// 	favFood := []string{"sushi", "ramen"}
// 	// pj := person{"pj", 18, favFood}
// 	pj := person{name: "pj", age: 18, favFood: favFood}
// 	fmt.Println(pj)
// 	fmt.Println((pj.name))
// }

//11.maps
// func main() {
// 	maps := map[string]string{"name": "pj", "sex": "male"}
// 	for _, value := range maps {
// 		fmt.Println(value)
// 	}
// }

//10.arrays and slice
// func main() {
// 	names := []string{"a", "b", "c"}
// 	names = append(names, "d")

// 	fmt.Println(names)
// }

//9.pointer
// func main() {
// 	a := 2
// 	b := &a
// 	*b = 20
// 	fmt.Println(a)
// }
//8.switch
// func canIDrink(age int) bool {
// 	switch koreanage := age + 2; koreanage {
// 	case 10:
// 		return false
// 	case 18:
// 		return true
// 	}
// 	return false
// }

// func main() {
// 	fmt.Println(canIDrink(16))
// }

//7.if
// func canIDrink(age int) bool {
// 	if koreanage := age + 2; koreanage < 18 {
// 		return false
// 	}
// 	return true
// }

// func main() {
// 	fmt.Println(canIDrink(16))
// }

//6.loop
// func superAdd(numbers ...int) int {
// 	total := 0
// 	for _, number := range numbers { //range는 값이 아니라 index를 줌
// 		fmt.Println(number)
// 		total += number
// 	}
// 	return total
// 	// for i := 0; i < len(numbers); i++ {
// 	// 	fmt.Println(numbers[i])
// 	// }
// 	// return 1
// }
// func main() {
// 	result := superAdd(1, 2, 3, 4, 5)
// 	fmt.Println(result)
// }

//5. naked return and defer(함수가 끝난 후에 작동하는 기능)
// func lenAndUpper(name string) (length int, uppercase string) {
// 	defer fmt.Println("I'm done")
// 	length = len(name)
// 	uppercase = strings.ToUpper(name)
// 	return
// }

// func main() {
// 	totalLenght, _ := lenAndUpper("pj")
// 	fmt.Println(totalLenght)
// }

//4.
// func repeatMe(words ...string) {
// 	fmt.Println(words)
// }

// func main() {
// 	repeatMe("qwe", "asd", "zxc")
// }
//3.
// func lenAndUpper(name string) (int, string) { //string을 입력 받아서 길이와 대문자로 변환한 결과를 반환(여러개의 return 가능)
// 	return len(name), strings.ToUpper(name)
// }

// func main() {
// 	// totalLenght, upperName := lenAndUpper("pj")
// 	// fmt.Println(totalLenght, upperName)

// 	totalLenght, _ := lenAndUpper("pj")//underbar는 반환값이 여러개일때 무시하는 용도로 사용
// 	fmt.Println(totalLenght)
// }
//2.
// func multiply(a, b int) int {
// 	return a * b
// }
//
// func main() {
// 	fmt.Println(multiply(2, 2))
// }
//1.
// func main() {
// 	name := "pj" // var name string = "pj"도 똑같음, 축약형(:=)은 func 안에서만 가능
// 	fmt.Println(name)
// }

// func main() {
// 	fmt.Println("hi")
// }
