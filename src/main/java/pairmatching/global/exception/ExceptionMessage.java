package pairmatching.global.exception;

public enum ExceptionMessage {
    INVALID_FILE("유효하지 않은 파일 형식입니다."),
    INVALID_INPUT("잘못된 입력입니다. 다시 입력해 주세요."),

    NOT_INTEGER("정수만 입력 가능합니다.");

    private static final String PREFIX = "[ERROR] ";

    public final String message;

    ExceptionMessage(final String message) {
        this.message = PREFIX + message;
    }
}
