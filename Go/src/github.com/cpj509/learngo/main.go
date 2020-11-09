package main

import (
	"os"
	"strings"

	"github.com/cpj509/learngo/scrapper"
	"github.com/labstack/echo"
)

func handleHome(c echo.Context) error {
	// return c.String(http.StatusOK, "Hello, World!")
	return c.File("home.html")
}

const fileName string = "jobs.csv"

func handleScrape(c echo.Context) error {
	defer os.Remove(fileName)
	// fmt.Println(c.FormValue("term"))
	term := strings.ToLower(scrapper.CleanString(c.FormValue("term")))
	scrapper.Scrape(term)
	return c.Attachment(fileName, fileName) //return the attachment file.
}

func main() {
	e := echo.New()
	e.GET("/", handleHome)
	e.POST("/scrape", handleScrape)
	e.Logger.Fatal(e.Start(":1323"))
}
