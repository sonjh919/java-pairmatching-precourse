package pairmatching;

import pairmatching.controller.PairmatchingController;
import pairmatching.global.config.AppConfig;

public class Application {
    public static void main(String[] args) {
        PairmatchingController pairmatchingController = AppConfig.INSTANCE.createController();
        pairmatchingController.start();
    }
}
