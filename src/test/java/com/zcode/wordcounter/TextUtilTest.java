package com.zcode.wordcounter;

import com.zcode.wordcounter.util.TextUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextUtilTest {

    @Test
    void isWord() {
        // pure words
        assertTrue(TextUtil.containsOnlyLetters.test("Hello"));
        assertTrue(TextUtil.containsOnlyLetters.test("Hello"));
        // falsy words
        assertFalse(TextUtil.containsOnlyLetters.test("Hello!"));
        assertFalse(TextUtil.containsOnlyLetters.test("Hello,"));
        assertFalse(TextUtil.containsOnlyLetters.test(" Hello,"));
        assertFalse(TextUtil.containsOnlyLetters.test("Ass!gnment"));
        assertFalse(TextUtil.containsOnlyLetters.test("M@rch"));
    }

}
