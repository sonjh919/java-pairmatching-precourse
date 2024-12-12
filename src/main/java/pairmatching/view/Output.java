package pairmatching.view;

public enum Output {
    FUNCTION_MESSAGE("기능을 선택하세요.\n"
            + "1. 페어 매칭\n"
            + "2. 페어 조회\n"
            + "3. 페어 초기화\n"
            + "Q. 종료"),

    COURSE_MISSION_MESSAGE("#############################################\n"
            + "과정: 백엔드 | 프론트엔드\n"
            + "미션:\n"
            + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n"
            + "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n"
            + "  - 레벨3: \n"
            + "  - 레벨4: 성능개선 | 배포\n"
            + "  - 레벨5: \n"
            + "############################################"),

    INPUT_COURSE_LEVEL_MISSION("과정, 레벨, 미션을 선택하세요.\n"
            + "ex) 백엔드, 레벨1, 자동차경주"),

    INPUT_MATCH_AGAIN("매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n"
            + "네 | 아니오"),

    PAIR_MATCHING_RESULT("페어 매칭 결과입니다."),

    PAIR_MATCHING_CLEAR("초기화 되었습니다."),

    NEW_LINE(System.lineSeparator());

    final String message;

    Output(final String message) {
        this.message = message;
    }
}
