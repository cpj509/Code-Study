// 사진 선택해서 바꾸기
var bigPic = document.querySelector("#cup");
var smallPics = document.querySelectorAll(".small");

for(var i = 0; i < smallPics.length; i++){
    smallPics[i].onclick = function(){
        var newPic = this.src;
        bigPic.setAttribute("src", newPic);
    }
}

// 상세설명 열기, 닫기
var isOpen = false;

//  1. Use querySelector and addEventListener.

// var view = document.querySelector("#view");
// var detail = document.querySelector("#detail");

// view.addEventListener("click", function(){
//     if(isOpen == false){
//         detail.style.display = "block";
//         view.innerText = "상세 설명 닫기";
//         isOpen = true;
//     }else{
//         detail.style.display = "none";
//         view.innerText = "상세 설명 열기";
//         isOpen = false;
//     }
// });

//  2. Use getElementById and onclick.

var view = document.getElementById("view");
var detail = document.getElementById("detail");

view.onclick = function(){
    if(isOpen == false){
        isOpen = true;
        view.innerHTML = "상세 설명 닫기";
        detail.style.display = "block";
    }else{
        isOpen = false;
        view.innerHTML = "상세 설명 보기";
        detail.style.display = "none";
    }
}