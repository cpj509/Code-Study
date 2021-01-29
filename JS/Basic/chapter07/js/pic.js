//이벤트 구현
var img = document.querySelector("#pic");
img.addEventListener("mouseover", changepic, false);

img.addEventListener("mouseout", originpic);

function changepic(){
    img.src = "images/girl.png";
}

function originpic(){
    img.src = "images/boy.png";
}