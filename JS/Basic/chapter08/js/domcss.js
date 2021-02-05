var myRect = document.querySelector("#rect");

//마우스 올리기 이벤트(익명함수)
myRect.addEventListener("mouseover", function(){
    myRect.style.backgroundColor = "green";
    myRect.style.borderRadius = "50%";
});

//마우스가 벗어났을 때
// myRect.addEventListener("mouseout", function(){
//     myRect.style.backgroundColor = "";
// })

myRect.addEventListener("mouseout", reset);

function reset(){
    myRect.style.backgroundColor = "";
    myRect.style.borderRadius = "";

}