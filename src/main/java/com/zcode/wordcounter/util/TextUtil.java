package com.zcode.wordcounter.util;

import java.util.function.Predicate;

public class TextUtil {

    /**
     * Private constructor to prevent creating new instances
     */
    private TextUtil() {
    }

    public static final Predicate<String> containsOnlyLetters = text -> {
        if (text.isEmpty()) return false;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (!Character.isLetter(letter)) {
                return false;
            }
        }
        return true;
    };

}
