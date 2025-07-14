package com.zcode.wordcounter;

import com.zcode.wordcounter.util.FileUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.zcode.wordcounter.logic.WordCounter.STOP_WORDS_FILE_NAME;
import static org.junit.jupiter.api.Assertions.*;

public class FileUtilTest {

    @Test
    void readLines() throws IOException {
        List<String> stopWords = FileUtil.readLines(FileUtil.getPathInResourcesFiles(STOP_WORDS_FILE_NAME));
        assertFalse(stopWords.isEmpty());
        assertEquals(4, stopWords.size());
        assertTrue(stopWords.containsAll(List.of("the", "a", "on", "off")));
    }

    @Test
    void readLinesThrowsException() {
        IOException error = assertThrows(IOException.class, () -> FileUtil.readLines("stopwords-test.txt"));
        assertEquals("Could not read data from file path: stopwords-test.txt", error.getMessage());
    }

}
