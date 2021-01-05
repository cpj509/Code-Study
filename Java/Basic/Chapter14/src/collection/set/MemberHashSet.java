package collection.set;

import collection.Member;

import java.util.HashSet;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet(){
        hashSet = new HashSet<>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public void removeMember(int memberID){
        //Use foreach
        for (Member member : hashSet) {
            if (memberID == member.getMemberID()) {
                hashSet.remove(member);
                return;
            }
        }
        //Use Iterator
//        Iterator<Member> iter = hashSet.iterator();
//        while(iter.hasNext()){
//            if(memberID == iter.next().getMemberID()){
//                iter.remove();
//                return;
//            }
//        }
        System.out.println(memberID + " is not valid.");
    }

    public void showAllMember(){
        for (Member member:
             hashSet) {
            System.out.println(member);
        }
    }
}
