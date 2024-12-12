package pairmatching.view;

public class View {
    private final InputView inputView;
    private final OutputView outputView;

    public View(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void outputFunctions() {
        outputView.printMessage(Output.FUNCTION_MESSAGE);
    }

    public String inputFunction() {
        return inputView.userInput();
    }

    public void outputCourseAndMission() {
        outputView.printMessage(Output.COURSE_MISSION_MESSAGE);
    }

    public String inputMatchDataFromUserInput() {
        outputView.printMessage(Output.INPUT_COURSE_LEVEL_MISSION);
        inputView.userInput();
    }
}
