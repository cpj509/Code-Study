package collection.list.arraylist;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList = new ArrayList<>();

    //add member
    public void addMember(Member member){
        arrayList.add(member);
    }

    //remove member
    public void removeMember(int memberNum){
        for (int i = 0; i < arrayList.size(); i++) {
            if(memberNum == arrayList.get(i).getMemberID()){
                arrayList.remove(i);
                System.out.println("remove success!!!");
                return;
//                return true;
            }
        }
        System.out.println(memberNum + " is not valid member number.");
//        return false;
    }

    //print member list
    public void showAllMember(){
        for (Member member:
             arrayList) {
            System.out.println(member);
        }

    }
}
