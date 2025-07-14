package com.zcode.wordcounter.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static final String RESOURCES_FILES_PATH = "files/";
    public static final String TXT_FILE_PREFIX = ".txt";

    private FileUtil() {
    }

    public static List<String> readLines(String filePath) throws IOException {
        InputStream stopWordsInputStream = FileUtil.class.getClassLoader().getResourceAsStream(filePath);
        if (stopWordsInputStream == null) {
            throw new IOException("Could not read data from file path: " + filePath);
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

    public static void validateFileExists(String filePath) throws FileNotFoundException {
        if (!fileExists(filePath)) {
            throw new FileNotFoundException("No file was found for the provided path: " + filePath);
        }
    }

    public static String getPathInResourcesFiles(String fileName) {
        return RESOURCES_FILES_PATH + fileName + TXT_FILE_PREFIX;
    }

    private static boolean fileExists(String filePath) {
        return FileUtil.class.getClassLoader().getResource(filePath) != null;
    }

}
