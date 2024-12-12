package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.constant.Course;
import pairmatching.global.config.ReadFile;

public class Crews {
    private List<Crew> crews;

    private Crews() {
        this.crews = new ArrayList<>();
        setBackendCrews();
        setFrontendCrews();
    }

    public static Crews create(){
        return new Crews();
    }

    private void setBackendCrews() {
        for (String name : ReadFile.readBackend()) {
            this.crews.add(new Crew(Course.BACKEND, name));
        }
    }

    private void setFrontendCrews() {
        for (String name : ReadFile.readFrontend()) {
            this.crews.add(new Crew(Course.FRONTEND, name));
        }
    }

}
