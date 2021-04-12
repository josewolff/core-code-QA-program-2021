package utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilesManager {

    public static String readFile(String fileLocation) {
        String content = "";
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(fileLocation));
            StringBuilder sb = new StringBuilder();
            String line = buffer.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = buffer.readLine();
            }
            content = sb.toString();
            buffer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return content;
    }
}
