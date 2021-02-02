var check = document.getElementById("shippingInfo");

// check.onclick = checkBox;   //onclick 속성 사용 -> 함수 대입
check.addEventListener("click", checkBox);  //addEventListener 사용 -> 함수 사용

var billingName = document.getElementById("billingName");
var billingTel = document.getElementById("billingTel");
var billingAddr = document.getElementById("billingAddr");

var shippingName = document.getElementById("shippingName");
var shippingTel = document.getElementById("shippingTel");
var shippingAddr = document.getElementById("shippingAddr");

function checkBox(){
    if(check.checked==true){
        shippingName.value = billingName.value;
        shippingTel.value = billingTel.value;
        shippingAddr.value = billingAddr.value;
    }else{
        shippingName.value = "";
        shippingTel.value = "";
        shippingAddr.value = "";
    }
}