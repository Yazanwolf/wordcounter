package com.zcode.wordcounter;

import com.zcode.wordcounter.logic.WordCounterManager;

public class App {

    public static void main(String[] args) {

        WordCounterManager wordCounterManager = new WordCounterManager();
        try {
            if (args.length > 0) {
                String inputFileName = args[0];
                wordCounterManager.countWordsInFile(inputFileName);
            } else {
                wordCounterManager.askUserForTextAndCountWords();
            }
        } finally {
            wordCounterManager.exit();
        }
    }

}
