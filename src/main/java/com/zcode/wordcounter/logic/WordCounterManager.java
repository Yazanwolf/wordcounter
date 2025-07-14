package com.zcode.wordcounter.logic;

import com.zcode.wordcounter.input.TextPrompt;
import com.zcode.wordcounter.util.FileUtil;
import com.zcode.wordcounter.view.ScreenManager;

import java.io.IOException;
import java.util.List;

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
        showCountedWords(enteredText);
    }
    
    public void countWordsInFile(String fileName) {
        String filePath = "files/" + fileName + ".txt";
        if (FileUtil.fileExists(filePath)) {
            try {
                List<String> fileLines = FileUtil.readLines(filePath);
                String inputAsString = String.join(" ", fileLines);
                showCountedWords(inputAsString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void exit() {
        this.textPrompt.close();
    }

    private void showCountedWords(String enteredText) {
        Long numberOfWords = wordCounter.countWords(enteredText);
        screenManager.showMessage("Number of words: " + numberOfWords, true);
    }
}
