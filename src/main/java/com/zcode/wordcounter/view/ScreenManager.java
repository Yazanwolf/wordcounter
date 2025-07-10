package com.zcode.wordcounter.view;

public class ScreenManager {

    public void showMessage(String message, boolean jumpToNewLine) {
        if (!jumpToNewLine) {
            System.out.print(message);
            return;
        }
        System.out.println(message);
    }

}
