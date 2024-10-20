package fileOperations;

import java.io.*;

public class TextSaver {
    public void saveToFile(String text) {
        File f = new File("showcase.txt");
        try {
            FileWriter writer = new FileWriter(f);

            writer.append(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFromFile(String path) {
        File f = new File(path);

        try {
            FileReader reader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder builder = new StringBuilder();
            String tmp;

            while((tmp = bufferedReader.readLine())  != null) {
                builder.append(tmp);
            }
            return builder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
