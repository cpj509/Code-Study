package q6;

public class Member {
    String memberId;
    String passwd;

    public Member(String memberId, String passwd){
        this.memberId = memberId;
        this.passwd = passwd;
    }

    public String showInfo(){
        return "아이디 : " + memberId + ", 비밀번호 : " + passwd;
    }
}
