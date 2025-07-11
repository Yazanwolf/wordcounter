package com.zcode.wordcounter.logic;

import com.zcode.wordcounter.util.FileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static com.zcode.wordcounter.util.TextUtil.containsOnlyLetters;

public class WordCounter {

    public static final String STOP_WORDS_FILE_PATH = "files/stopwords.txt";
    private static final String TEXT_SEPARATOR = " ";
    private final List<String> stopWords = new ArrayList<>();
    private final Predicate<String> isWord = text -> containsOnlyLetters.test(text)
            && stopWords.stream().noneMatch(word -> word.equals(text));

    public WordCounter() {
        try {
            stopWords.addAll(FileUtil.readLines(STOP_WORDS_FILE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Long countWords(String enteredText) {
        if (enteredText == null) {
            throw new IllegalArgumentException("Entered text can not be empty!");
        }
        return Arrays.stream(enteredText.split(TEXT_SEPARATOR)).filter(isWord).count();
    }

}
