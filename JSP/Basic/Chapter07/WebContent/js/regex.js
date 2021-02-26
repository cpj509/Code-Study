/**
 * 유효성 검사
 */
function checkMember(){
	var form = document.Member;
	var id = form.userid.value;
	var pwd = form.passwd.value;
	var name = form.name.value;
	var phone = form.phone1.value + "-" +
				form.phone2.value + "-" +
				form.phone3.value;
				
	var regExId = /^[a-zA-Zㄱ-ㅎㅏ-ㅣ가-힣]*$/;	//문자로 시작
	var regExPwd = /^[0-9]*$/;	//숫자
	var regExName = /^[가-힣]*$/;	//한글
	var regExPhone = /^\d{3}-\d{3,4}-\d{4}$/;	//중괄호는 * 들어간 것과 같음
	
	if(!regExId.test(id)){
		alert("아이디는 문자만 입력 해 주세요.");
		id.select();
		return false;
	}
	if(!regExPwd.test(pwd)){
		alert("비밀번호는 숫자만 입력 해 주세요.");
		pwd.focus();
		return false;
	}
	if(!regExName.test(name)){
		alert("이름은 한글로 입력 해 주세요.");
		name.select();
		return false;
	}
	if(!regExPhone.test(phone)){
		alert("연락처를 알맞게 입력 해 주세요.");
		return false;
	}
	form.submit();
}