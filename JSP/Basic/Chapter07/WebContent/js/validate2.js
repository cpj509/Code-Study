/**
 * 폼 유효성 검사 
-아이디(영어 소문자) -비밀번호(숫자만 입력) 
 */
function checkForm(){
	var form = document.loginForm;
	
	for(var i = 0; i < form.userid.value.length; i++){
		var ch = form.userid.value.charAt(i);
		//아이디
		if((ch < 'a' || ch > 'z') && (ch >= 'A' || ch <= 'Z') && (ch >= '0' || ch <= '9')){
			alert("아이디는 영문 소문자만 가능합니다.");
			form.userid.select();
			return false;
		}
		
		//비밀번호
		if(isNaN(form.passwd.value)){
			alert("비밀번호는 숫자만 가능합니다.");
			form.passwd.select();
			return false;
		}
	}
	
	form.submit();
}