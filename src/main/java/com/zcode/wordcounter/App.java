package com.zcode.wordcounter;

import com.zcode.wordcounter.logic.WordCounterManager;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try (WordCounterManager wordCounterManager = new WordCounterManager()) {
            if (args.length > 0) {
                String inputFileName = args[0];
                wordCounterManager.countWordsInFile(inputFileName);
            } else {
                wordCounterManager.askUserForTextAndCountWords();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
