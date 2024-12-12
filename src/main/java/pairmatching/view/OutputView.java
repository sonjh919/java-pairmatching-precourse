package pairmatching.view;

import static pairmatching.view.Output.NEW_LINE;

public class OutputView {

    public void printMessage(final Output output) {
        System.out.println(output.message);
    }

    public void printNewLine() {
        System.out.print(NEW_LINE.message);
    }
}
