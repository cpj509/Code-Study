//  생성자 함수 - Book 만들기
function Book(title, author, price){
    this.title = title;
    this.author = author;
    this.price = price;
}

var html = new Book("asd", "asdf", 123);
var javascript = new Book("qwe", "qwer", 456);
var jsp = new Book("zxc", "zxcv", 789);

//배열에 객체를 저장
var bookList = [html, javascript, jsp];

document.write("<h1>책 제목으로 살펴보기</h1>")
for(var i = 0; i < bookList.length; i++){
    document.write("<p>" + bookList[i].title + "<br></p>");
}