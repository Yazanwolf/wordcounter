package com.zcode.wordcounter.logic;

import java.util.Arrays;

import static com.zcode.wordcounter.util.TextUtil.isWord;

public class WordCounter {

    private static final String TEXT_SEPARATOR = " ";

    public Long countWords(String enteredText) {
        if (enteredText == null || enteredText.isEmpty()) {
            throw new IllegalArgumentException("Entered text can not be empty!");
        }
        return Arrays.stream(enteredText.split(TEXT_SEPARATOR)).filter(isWord).count();
    }

}
