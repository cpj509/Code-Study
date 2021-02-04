//웹 사이트가 시작되면 시계가 작동
var watch = setInterval(myWatch, 1000);

function myWatch(){
    var date = new Date();
    var now = date.toLocaleString();


    document.getElementById("demo").innerHTML = now;
}