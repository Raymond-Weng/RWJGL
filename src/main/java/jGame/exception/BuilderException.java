package jGame.exception;

public class BuilderException extends RuntimeException {
    private final String message;

    public BuilderException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
