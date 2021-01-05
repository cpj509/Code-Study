package collection;

public class Member {
    private int memberID;
    private String memberName;

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member name is " + memberName + " and member id is " + memberID;
    }
//hashset에서는 equals, hashcode를 재정의 해야 중복을 방지하지만 map에서는 관계 없이 그냥 중복을 방지해줌.
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member) obj;
            return this.memberID == member.memberID;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberID;
    }
}
