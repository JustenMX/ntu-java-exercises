package activity7.exception;

public class InvalidArrayIndexException extends RuntimeException {
    public InvalidArrayIndexException(String message) {
        super(message);
    }
}