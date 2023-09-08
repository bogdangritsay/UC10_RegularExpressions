package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexValidatorTest {

    @Test
    void testTooShortInput() {
        assertFalse(RegexValidator.validateString("A1!", 5));
    }

    @Test
    void testTooLongInput() {
        assertFalse(RegexValidator.validateString("Aa1!Aa1!Aa1!Aa1!", 10));
    }

    @Test
    void testMatchingInputLength() {
        assertTrue(RegexValidator.validateString("Aa1!Aa1!", 8));
    }

    @Test
    void testMissingUppercase() {
        assertFalse(RegexValidator.validateString("aa1!", 10));
    }

    @Test
    void testMissingLowercase() {
        assertFalse(RegexValidator.validateString("AA1!", 10));
    }

    @Test
    void testMissingDigit() {
        assertFalse(RegexValidator.validateString("Aa!!", 10));
    }

    @Test
    void testMissingSpecialCharacter() {
        assertFalse(RegexValidator.validateString("Aa11", 10));
    }

    @Test
    void testWhitespaceAtBeginning() {
        assertFalse(RegexValidator.validateString(" Aa1!", 10));
    }

    @Test
    void testWhitespaceAtEnd() {
        assertFalse(RegexValidator.validateString("Aa1! ", 10));
    }

    @Test
    void testWhitespaceInTheMiddle() {
        assertFalse(RegexValidator.validateString("Aa 1!", 10));
    }

}