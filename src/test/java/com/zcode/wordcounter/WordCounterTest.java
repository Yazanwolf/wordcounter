package com.zcode.wordcounter;

import com.zcode.wordcounter.logic.WordCounter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WordCounterTest {

    private WordCounter wordCounter;

    @BeforeAll
    void setup() {
        this.wordCounter = new WordCounter();
    }

    @Test
    void countWordsInsidePureText() {
        String text = "Mary had a little lamb";
        Long numberOfWords = wordCounter.countWords(text);
        assertEquals(5L, numberOfWords);
    }

    @Test
    void countWordsInsideTextContainsSymbols() {
        String text = "Ma*ry had a little lamb";
        Long numberOfWords = wordCounter.countWords(text);
        assertEquals(4L, numberOfWords);
        text = "Mary had a little lamb.";
        numberOfWords = wordCounter.countWords(text);
        assertEquals(4L, numberOfWords);
        text = "Mary had, a little lamb?";
        numberOfWords = wordCounter.countWords(text);
        assertEquals(3L, numberOfWords);
    }

}
