package exception.thrownew;

public class IDFormatException extends Exception{
    private static final long serialVersionUID = 1001L;

    //매개변수로 예외 상황 메세지를 받음
    public IDFormatException(String message) {
        super(message);
    }
}
