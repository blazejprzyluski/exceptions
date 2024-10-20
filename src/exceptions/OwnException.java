package exceptions;

public class OwnException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Don't divide by 0!";
    }
}
