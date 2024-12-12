package pairmatching.domain.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Mission {
    Map<Level, List<String>> missions;

    public Mission() {
        this.missions = new EnumMap<>(Level.class);
        this.missions.put(Level.LEVEL1, Arrays.asList("자동차경주","로또","숫자야구게임"));
        this.missions.put(Level.LEVEL2, Arrays.asList("장바구니","결제","지하철노선도"));
        this.missions.put(Level.LEVEL3, new ArrayList<>());
        this.missions.put(Level.LEVEL4, Arrays.asList("성능개선","배포"));
        this.missions.put(Level.LEVEL5, new ArrayList<>());
    }
}
