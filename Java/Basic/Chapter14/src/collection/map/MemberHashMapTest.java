package collection.map;

import collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        //add members
        memberHashMap.addMember(new Member(1, "Choi"));
        memberHashMap.addMember(new Member(3, "Kim"));
        memberHashMap.addMember(new Member(2, "J"));

        memberHashMap.showAllMember();

        //remove member
        memberHashMap.removeMember(2);

        memberHashMap.showAllMember();

        System.out.println(memberHashMap);
    }
}
