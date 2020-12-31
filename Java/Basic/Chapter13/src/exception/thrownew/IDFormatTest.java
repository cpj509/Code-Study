package exception.thrownew;

public class IDFormatTest {
    private String userID;
    public String getUserID(){
        return userID;
    }
    //아이디는 null이 아니거나 글자수가 8~20자 이내로 한정.
    public void setUserID(String userID) throws IDFormatException {
        if(userID==null)
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        else if(userID.length() < 8 || userID.length() > 20)
            throw new IDFormatException("아이디는 8~20자 이내로 한정.");
        else
            this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest id1 = new IDFormatTest();
        String userID = null;
        try {
            id1.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());//문자열 출력
        }

        userID = "abc123";
        try {
            id1.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getLocalizedMessage());
        }


    }
}
