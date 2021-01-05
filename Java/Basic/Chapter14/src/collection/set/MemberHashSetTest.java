package collection.set;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberSet = new MemberHashSet();

        memberSet.addMember(new Member(1, "A"));
        memberSet.addMember(new Member(1, "A"));
        memberSet.addMember(new Member(2, "B"));
        memberSet.addMember(new Member(3, "C"));

        memberSet.showAllMember();

        memberSet.removeMember(2);
        memberSet.removeMember(4);

        memberSet.showAllMember();






    }
}
