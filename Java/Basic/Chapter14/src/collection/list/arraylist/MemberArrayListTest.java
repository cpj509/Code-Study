package collection.list.arraylist;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        memberArrayList.addMember(new Member(1, "Q"));
        memberArrayList.addMember(new Member(2, "W"));
        memberArrayList.addMember(new Member(3, "E"));
        memberArrayList.addMember(new Member(3, "R"));

        memberArrayList.showAllMember();

        memberArrayList.removeMember(4);
        memberArrayList.showAllMember();

        memberArrayList.removeMember(3);
        memberArrayList.showAllMember();


    }
}
