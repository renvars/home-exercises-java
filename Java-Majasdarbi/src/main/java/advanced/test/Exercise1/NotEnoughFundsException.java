package advanced.test.Exercise1;

public class NotEnoughFundsException extends RuntimeException {
    private String message;

    public NotEnoughFundsException(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }
}
