package pairmatching.domain;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import pairmatching.domain.constant.Course;
import pairmatching.domain.constant.Level;

public class Crew {
    private Course course;
    private String name;
    private Map<Level, List<Crew>> metCrews;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
        this.metCrews = new EnumMap<>(Level.class);
    }
}
