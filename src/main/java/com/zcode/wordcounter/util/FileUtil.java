package com.zcode.wordcounter.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    private FileUtil() {
    }

    public static List<String> readLines(String filePath) throws IOException {
        InputStream stopWordsInputStream = FileUtil.class.getClassLoader().getResourceAsStream(filePath);
        if (stopWordsInputStream == null) {
            throw new FileNotFoundException("The file stopwords.txt was not found.");
        }
        List<String> fileLines = new ArrayList<>();
        try (InputStreamReader dataInputStream = new InputStreamReader(stopWordsInputStream);
             BufferedReader bufferedReader = new BufferedReader(dataInputStream)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileLines.add(line);
            }
        } finally {
            stopWordsInputStream.close();
        }
        return fileLines;
    }

}
