package test;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File qaFile = new File("QA.md");
            BufferedReader reader = new BufferedReader(new FileReader(qaFile));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
