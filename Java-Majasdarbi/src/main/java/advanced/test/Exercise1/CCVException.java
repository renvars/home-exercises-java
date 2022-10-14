package advanced.test.Exercise1;

public class CCVException extends RuntimeException {
    private String message;

    public CCVException(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }
}
