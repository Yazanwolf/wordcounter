package com.zcode.wordcounter.logic;

import com.zcode.wordcounter.input.TextPrompt;
import com.zcode.wordcounter.view.ScreenManager;

public class WordCounterManager {

    private final TextPrompt textPrompt;
    private final WordCounter wordCounter;
    private final ScreenManager screenManager;

    public WordCounterManager() {
        this.textPrompt = new TextPrompt();
        this.wordCounter = new WordCounter();
        this.screenManager = new ScreenManager();
    }

    public void askUserForTextAndCountWords() {
        screenManager.showMessage("Enter text: ", false);
        String enteredText = textPrompt.getInputFromUser();
        Long numberOfWords = wordCounter.countWords(enteredText);
        screenManager.showMessage("Number of words: " + numberOfWords, true);
    }

    public void exit() {
        this.textPrompt.close();
    }
}
