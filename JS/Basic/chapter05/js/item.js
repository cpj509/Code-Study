//물품 리스트 배열
var itemList = [];

//버튼에 접근
var addBtn = document.getElementById("add");

//버튼 클릭 이벤트
addBtn.addEventListener("click", function(){
    var item = document.getElementById("item").value;
    if(item != ""){
        itemList.push(item);
        document.getElementById("item").value = ""; //내용 지우기
        document.getElementById("item").focus();    //커서 위치
    }
    showList();
});

function showList(){
    var list = "<ul>";  //리스트 문자를 저장 할 변수 선언
    for(var i = 0; i < itemList.length; i++){
        list += "<li>" + itemList[i] + "<span class='close' id=" + i + ">X</span></li>"
    }
    list += "</ul>"
    document.getElementById("itemList").innerHTML = list;
    var removeItem = document.querySelectorAll(".close");
    for(var i = 0; i < removeItem.length; i++){
        removeItem[i].addEventListener("click", function(){
            var id = this.getAttribute("id");   //x를 가져와서 저장
            itemList.splice(id, 1); //id 위치에서 1개 삭제
            showList();
        });
    }
}

