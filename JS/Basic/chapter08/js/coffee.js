//큰 사진 선택
var bigPic = document.querySelector("#cup");

//작은 사진 모두 선택 - 배열
var smallPic = document.querySelectorAll(".small");

// //onclick 이벤트
// for(var i = 0; i < smallPic.length; i++){
//     smallPic[i].onclick = showBig;
// }

// function showBig(){
//     var newPic = this.src;  //this 이벤트 일어난 대상의 속성 값
//     bigPic.setAttribute("src", newPic);
//     //setAttribute("속성", "속성값")

//addEventListener() 사용
for(var i = 0; i < smallPic.length; i++){
    smallPic[i].addEventListener("click", function(){
        var newPic = this.src;
        bigPic.setAttribute("src", newPic);
    })
}