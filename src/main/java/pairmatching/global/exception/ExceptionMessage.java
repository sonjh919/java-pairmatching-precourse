package pairmatching.global.exception;

public enum ExceptionMessage {
    INVALID_FILE("유효하지 않은 파일 형식입니다."),
    INVALID_INPUT("잘못된 입력입니다. 다시 입력해 주세요."),

    INVALID_FUNCTION_INPUT("잘못된 기능 선택입니다. 다시 입력해 주세요."),
    MATCH_DATA_NONE("매칭 이력이 없습니다. 다시 입력해 주세요."),
    INAVLID_MATCH_AGAIN_INPUT("잘못된 입력입니다. 다시 입력해 주세요."),
    INVALID_COURSE("없는 과정입니다. 다시 입력해 주세요."),
    INVALID_LEVEL("없는 레벨입니다. 다시 입력해 주세요."),
    INVALID_MISSION("없는 미션입니다. 다시 입력해 주세요"),

    NOT_INTEGER("정수만 입력 가능합니다.");

    private static final String PREFIX = "[ERROR] ";

    public final String message;

    ExceptionMessage(final String message) {
        this.message = PREFIX + message;
    }
}
