// package main

// import (
// 	"encoding/csv"
// 	"fmt"
// 	"log"
// 	"net/http"
// 	"os"
// 	"strconv"
// 	"strings"

// 	"github.com/PuerkitoBio/goquery"
// )

// type extractedJob struct {
// 	id       string
// 	title    string
// 	location string
// 	salary   string
// 	summary  string
// }

// var baseURL string = "https://kr.indeed.com/%EC%B7%A8%EC%97%85?q=&l=%EA%B2%BD%EA%B8%B0%EB%8F%84+%EC%9D%B4%EC%B2%9C"

// func main() {
// 	var jobs []extractedJob
// 	c := make(chan []extractedJob)
// 	totalpages := getPages() //check number of pages

// 	for i := 0; i < totalpages; i++ {

// 		go getPage(i, c)

// 	}
// 	for i := 0; i < totalpages; i++ {
// 		extractedJobs := <-c
// 		jobs = append(jobs, extractedJobs...)
// 	}
// 	writeJobs(jobs)
// 	fmt.Println("Done, extracted", len(jobs))

// }

// func getPage(page int, mainC chan<- []extractedJob) {
// 	var jobs []extractedJob
// 	c := make(chan extractedJob)
// 	pageURL := baseURL + "&start=" + strconv.Itoa(page*10)
// 	fmt.Println("Requesting", pageURL)
// 	res, err := http.Get(pageURL)
// 	checkErr(err)
// 	checkCode(res)
// 	defer res.Body.Close() //invent memory leak

// 	doc, err := goquery.NewDocumentFromReader(res.Body)
// 	checkErr(err)

// 	searchCards := doc.Find(".jobsearch-SerpJobCard")
// 	searchCards.Each(func(i int, card *goquery.Selection) {
// 		go extractJob(card, c)
// 	})
// 	for i := 0; i < searchCards.Length(); i++ {
// 		job := <-c
// 		jobs = append(jobs, job)
// 	}
// 	mainC <- jobs
// }

// func extractJob(card *goquery.Selection, c chan<- extractedJob) { //extract job details from each card
// 	id, _ := card.Attr("data-jk")
// 	title := cleanString(card.Find(".title>a").Text())
// 	location := cleanString(card.Find(".sjcl").Text())
// 	salary := cleanString(card.Find(".salaryText").Text())
// 	summary := cleanString(card.Find(".summary").Text())
// 	// fmt.Println(id, title, location, salary, summary)
// 	c <- extractedJob{
// 		id:       id,
// 		title:    title,
// 		location: location,
// 		salary:   salary,
// 		summary:  summary}
// }

// func cleanString(str string) string {
// 	return strings.Join(strings.Fields(strings.TrimSpace(str)), " ") //TrimSpace: remove space //Fields: make array // Join: merge string array with seperator
// }

// func getPages() int {
// 	pages := 0
// 	res, err := http.Get(baseURL)
// 	checkErr(err)
// 	checkCode(res)
// 	defer res.Body.Close() //invent memory leak

// 	doc, err := goquery.NewDocumentFromReader(res.Body)
// 	checkErr(err)
// 	doc.Find(".pagination").Each(func(i int, s *goquery.Selection) {
// 		// fmt.Println(s.Html())
// 		// fmt.Println(s.Find("a").Length())//print total link number
// 		pages = s.Find("a").Length()
// 	})
// 	return pages

// }

// func writeJobs(jobs []extractedJob) {
// 	file, err := os.Create("jobs.csv")
// 	checkErr(err)

// 	w := csv.NewWriter(file)
// 	defer w.Flush() //if end function, create file

// 	headers := []string{"Link", "Title", "Location", "Salary", "Summary"}

// 	wErr := w.Write(headers)
// 	checkErr(wErr)

// 	for _, job := range jobs {
// 		jobSlice := []string{"https://kr.indeed.com/viewjob?jk=" + job.id, job.title, job.location, job.salary, job.summary}
// 		jwErr := w.Write(jobSlice)
// 		checkErr(jwErr)
// 	}

// }

// func checkErr(err error) {
// 	if err != nil {
// 		log.Fatalln(err)
// 	}
// }

// func checkCode(res *http.Response) {
// 	if res.StatusCode != 200 {
// 		log.Fatalln("Request failed with Status:", res.StatusCode)
// 	}

// }
