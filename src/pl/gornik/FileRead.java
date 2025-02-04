package pl.gornik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    private BufferedReader reader;
    private StringBuilder builder;

    public StringBuilder readFile(String path) throws IOException {
            builder = new StringBuilder();
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
        return builder;
    }
}
