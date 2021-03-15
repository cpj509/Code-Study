/**
 *	폼 유효성 검사 
 */

function checkForm(){
	var form = document.loginForm;
	
	//아이디나 비밀번호 글자 수 체크
	if(form.userid.value.length < 4 || form.userid.value.length > 12){
		alert("아이디는 4 ~ 12자 이내로 입력 가능합니다.");
		form.userid.select();	//현재의 입력 상자 범위 지정
		return false;
	}
	
	if(form.passwd.value.length < 5){
		alert("비밀번호는 5자 이상 입력 가능합니다.");
		form.passwd.select();
		return false;
	}
	form.submit();
}