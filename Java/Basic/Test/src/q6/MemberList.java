package q6;

import java.util.ArrayList;

public class MemberList {

        ArrayList<Member> memberList;
        //생성자
        public MemberList(){
            memberList = new ArrayList<>();
        }
        //회원 추가
        public void addMember(Member member){
            memberList.add(member);
        }

        //회원 목록
        public void showAllMember() {
            for (Member a:
                 memberList) {
                System.out.println(a.showInfo());
            }
        }
}
