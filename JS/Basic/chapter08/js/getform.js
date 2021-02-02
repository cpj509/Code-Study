//select 태그 이름에 폼 이름으로 접근
var selectMenu = document.testForm.major;

// function displaySelect(){
//     var selectedText = selectMenu.options[selectMenu.selectedIndex].innerText;
//     alert(selectedText);
// }


//id로 접근(value를 가져옴)
function displaySelect(){
    var selectedText = document.getElementById("subject").value;
    alert(selectedText)
}