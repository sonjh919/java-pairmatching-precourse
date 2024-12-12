package pairmatching.global.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileSimple {
    private static final String PROMOTIONS_FILE_PATH = "src/main/resources/promotions.md";
    private static final String DELIMITER = ",";

    private List<String> line;

    public ReadFileSimple() {
        this.line = new ArrayList<>();
    }

    public void read(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(PROMOTIONS_FILE_PATH));

            line = br.lines().collect(Collectors.toList());
            List<String> names = Arrays.asList(line.get(0).split(DELIMITER));

            System.out.println("line.size() = " + line.size());
            names.forEach(System.out::println);
        }
        catch (FileNotFoundException ignored) {

        }
    }

}
