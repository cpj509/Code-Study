package q6;

public class MemberTest {
    public static void main(String[] args) {
        //회원 5명 생성
        MemberList list = new MemberList();
        Member member1 = new Member("river2015", "r2015");
        Member member2 = new Member("river2016", "r2016");
        Member member3 = new Member("river2017", "r2017");
        Member member4 = new Member("river2018", "r2018");
        Member member5 = new Member("river2019", "r2019");


        //회원 추가
        list.addMember(member1);
        list.addMember(member2);
        list.addMember(member3);
        list.addMember(member4);
        list.addMember(member5);

        //회원 목록
        list.showAllMember();

    }
}
