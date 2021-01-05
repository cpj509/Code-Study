package collection.map;

import collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    //add member
    public void addMember(Member member){
        hashMap.put(member.getMemberID(), member);
    }

    //remove member
    public boolean removeMember(int memberID){
        if(hashMap.containsKey(memberID)){
            hashMap.remove(memberID);
            return true;
        }
        System.out.println(memberID + " is not valid.");
        return false;
    }

    //print member
    public void showAllMember(){
        Iterator<Integer> iter = hashMap.keySet().iterator();
        //Iterator<Key>
        while(iter.hasNext()){
            Integer key = iter.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "MemberHashMap{" +
                "hashMap=" + hashMap +
                '}';
    }
}
