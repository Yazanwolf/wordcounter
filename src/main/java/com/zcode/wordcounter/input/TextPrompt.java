package com.zcode.wordcounter.input;

import java.io.Closeable;
import java.util.Scanner;

public class TextPrompt implements Closeable {

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
