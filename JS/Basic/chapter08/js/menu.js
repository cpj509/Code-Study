//스크롤 이동 시 상단 메뉴 고정

// // My simple version
// document.onscroll = function(){
//     document.getElementById("navbar").classList.toggle("sticky");
// }

// Another verseion
var topMenu = document.getElementById("navbar");
var topMenuPosition = topMenu.offsetTop;    //메뉴 top의 위치

//scroll 이벤트 처리
document.addEventListener("scroll", function(){
    if(window.pageYOffset >= topMenuPosition){
        topMenu.classList.add("sticky");
    }else{
        topMenu.classList.remove("sticky");
    }
})