package pairmatching.view;

public class View {
    private final InputView inputView;
    private final OutputView outputView;

    public View(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public String inputText() {
        outputView.printMessage(Output.NEW_LINE);
        return inputView.userInput();
    }

    public void outputText() {
        outputView.printNewLine();
        outputView.printMessage(Output.NEW_LINE);
    }

    public void outputFunctions() {
        outputView.printMessage(Output.FUNCTION_MESSAGE);
    }

    public String inputFunction() {
        return inputView.userInput();
    }
}
