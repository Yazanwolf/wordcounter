package com.zcode.wordcounter.input;

import java.util.Scanner;

public class TextPrompt implements AutoCloseable {

    private final Scanner scanner;

    public TextPrompt() {
        this.scanner = new Scanner(System.in);
    }

    public String getInputFromUser() {
        return scanner.nextLine();
    }

    @Override
    public void close() {
        scanner.close();
    }

}
