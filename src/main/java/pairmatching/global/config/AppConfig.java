package pairmatching.global.config;

import pairmatching.controller.PairmatchingController;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;
import pairmatching.view.View;

public enum AppConfig {
    INSTANCE;

    public PairmatchingController createController() {
        return new PairmatchingController(createView());
    }

    public View createView() {
        return new View(createInputView(), createOutputView());
    }

    private InputView createInputView() {
        return new InputView();
    }

    private OutputView createOutputView() {
        return new OutputView();
    }
}
