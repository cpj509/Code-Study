//입력 값 검증
var id = document.getElementById("user-id");
var pwd1 = document.getElementById("pwd1");
var pwd2 = document.getElementById("pwd2");

id.onchange = checkID;  //call checkID() method.
pwd1.onchange = checkPwd1;
pwd2.onchange = checkPwd2;

function checkID(){
    if(id.value.length < 4 || id.value.length > 15){
        alert("아이디는 4 ~ 15자 까지 가능합니다.");
        id.select();    //선택 범위 지정
    }
}

function checkPwd1(){
    if(pwd1.value.length < 8){
        alert("비밀번호는 8자 이상으로 입력 해 주세요.")
        pwd1.focus();   //커서 위치
        pwd1.value = "";    //초기화
    }

}

function checkPwd2(){
    if(pwd1.value != pwd2.value){
        alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.")
        pwd2.focus();   //커서 위치
        pwd2.value = "";    //초기화
    }
}