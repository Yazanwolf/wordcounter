package com.zcode.wordcounter;

import com.zcode.wordcounter.logic.WordCounterManager;

public class App {

    public static void main(String[] args) {
        WordCounterManager wordCounterManager = new WordCounterManager();
        wordCounterManager.askUserForTextAndCountWords();
    }

}
