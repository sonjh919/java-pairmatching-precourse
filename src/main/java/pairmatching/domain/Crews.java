package pairmatching.domain;

import java.util.List;
import pairmatching.global.config.ReadFile;

public class Crews {
    private List<String> backend;
    private List<String> frontend;

    private Crews(List<String> backend, List<String> frontend) {
        this.backend = backend;
        this.frontend = frontend;
    }

    public static Crews create(){
        return new Crews(ReadFile.readBackend(), ReadFile.readFrontend());
    }
}
