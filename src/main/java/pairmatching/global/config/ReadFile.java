package pairmatching.global.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {
    private static final String BACKEND_FILE_PATH = "src/main/resources/backend-crew.md";
    private static final String FRONTEND_FILE_PATH = "src/main/resources/frontend-crew.md";

    public ReadFile() {
    }
    public static List<String> readBackend(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(BACKEND_FILE_PATH));
            return br.lines().collect(Collectors.toList());
        }
        catch (FileNotFoundException ignored) {
        }
        throw new RuntimeException();
    }

    public static List<String> readFrontend(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(FRONTEND_FILE_PATH));
            return br.lines().collect(Collectors.toList());
        }
        catch (FileNotFoundException ignored) {
        }
        throw new RuntimeException();
    }

}
