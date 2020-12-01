package JunitPracticeproblem;

public class UserValueException extends Exception {
    public enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY
    }
    public ExceptionType type;
    public UserValueException(ExceptionType type,String message){

        super(message);
        this.type=type;
    }
}
