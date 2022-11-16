package bridge.constant;

public enum ErrorMessage {

    IS_NOT_POSITIVE_NUMBER("[ERROR] 다리 길이 입력값이 양의 정수가 아닙니다."),
    IS_OUT_OF_RANGE("[ERROR] 다리 길이 입력값이 범위 3 ~ 20을 벗어났습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}