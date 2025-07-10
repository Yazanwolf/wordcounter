package com.zcode.wordcounter;

import com.zcode.wordcounter.util.TextUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextUtilTest {

    @Test
    void isWord() {
        // pure words
        assertTrue(TextUtil.isWord.test("Hello"));
        assertTrue(TextUtil.isWord.test("Hello"));
        // falsy words
        assertFalse(TextUtil.isWord.test("Hello!"));
        assertFalse(TextUtil.isWord.test("Hello,"));
        assertFalse(TextUtil.isWord.test(" Hello,"));
        assertFalse(TextUtil.isWord.test("Ass!gnment"));
        assertFalse(TextUtil.isWord.test("M@rch"));
    }

}
