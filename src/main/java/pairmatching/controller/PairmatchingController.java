package pairmatching.controller;

import static pairmatching.global.exception.ExceptionHandler.getValidInput;
import static pairmatching.global.exception.ExceptionMessage.INVALID_FUNCTION_INPUT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import pairmatching.domain.Crews;
import pairmatching.global.exception.ValidatorBuilder;
import pairmatching.view.View;

public class PairmatchingController {
    private final View view;

    public PairmatchingController(final View view) {
        this.view = view;
    }

    public void start(){
        Crews crews = setCrews();
        while(true){
            String functionNumber = selectFunctions();
            if(functionNumber.equals("1")){
                pairmatching();
            }
            if(functionNumber.equals("2")){
//                selectPair();
            }
            if(functionNumber.equals("3")){
//                clearPair();
            }
            if(functionNumber.equals("Q")){
                break;
            }
        }

//
//        //1. 페어매칭
//        outputCourseAndMission();
//        inputMatchAgainFromUserInput();
//        inputMatchDataFromUserInput();
//        pairMatchingFromMatchData();
//        outputMatchingResult();
//
//        //2. 페어조회
//        outputCourseAndMission();
//        inputMatchDataFromUserInput();
//        outputMatchingResult();
//
//        //3. 페어 초기화
//        clearMatchingResult();
//
//        //Q. 종료
//        //return
    }

    private Crews setCrews() {
        return Crews.create();
    }

    private String selectFunctions() {
        view.outputFunctions();
        return getValidInput(() -> validateFunction(view.inputFunction()));
    }

    private String validateFunction(String input) {
        List<String> functions = Arrays.asList("1", "2", "3", "Q");
        return ValidatorBuilder.from(input)
                .validate(function -> !functions.contains(input), INVALID_FUNCTION_INPUT)
                .get();
    }

    private void pairmatching() {
    }
}
