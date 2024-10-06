package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    // Test cases for isStrongPassword method
    @Test
    public void testIsStrongPassword() {
        StringProcessor processor = new StringProcessor();

        // Test Case 1: Strong password (uppercase, lowercase, digit, special character)
        assertTrue(processor.isStrongPassword("P@ssw0rd"));

        // Test Case 2: Weak password (missing special character)
        assertFalse(processor.isStrongPassword("Passw0rd"));

        // Test Case 3: Weak password (all lowercase)
        assertFalse(processor.isStrongPassword("password"));

        // Test Case 4: Weak password (missing digit)
        assertFalse(processor.isStrongPassword("P@ssword"));

        // Test Case 5: Weak password (missing uppercase letter)
        assertFalse(processor.isStrongPassword("p@ssw0rd"));
    }

    // Test cases for calculateDigits method
    @Test
    public void testCalculateDigits() {
        StringProcessor processor = new StringProcessor();

        // Test Case 1: Sentence with multiple digits
        assertEquals(3, processor.calculateDigits("123abc"));

        // Test Case 2: Sentence with no digits
        assertEquals(0, processor.calculateDigits("No digits here"));

        // Test Case 3: Single digit in the sentence
        assertEquals(1, processor.calculateDigits("This is digit 1."));

        // Test Case 4: Digits and special characters
        assertEquals(6, processor.calculateDigits("Phone: +123-456"));

        // Test Case 5: Empty string
        assertEquals(0, processor.calculateDigits(""));
    }

    // Test cases for calculateWords method
    @Test
    public void testCalculateWords() {
        StringProcessor processor = new StringProcessor();

        // Test Case 1: Sentence with multiple words
        assertEquals(5, processor.calculateWords("The quick brown fox jumps"));

        // Test Case 2: Single word
        assertEquals(1, processor.calculateWords("Word"));

        // Test Case 3: Multiple spaces between words
        assertEquals(5, processor.calculateWords("The  quick   brown fox jumps"));

        // Test Case 4: No words (only spaces)
        assertEquals(0, processor.calculateWords("     "));

        // Test Case 5: Empty string
        assertEquals(0, processor.calculateWords(""));
    }

    // Test cases for calculateExpression method (if implemented)
    @Test
    public void testCalculateExpression() {
        StringProcessor processor = new StringProcessor();

        // Test Case 1: Simple addition
        assertEquals(7, processor.calculateExpression("3 + 4"), 0.001);

        // Test Case 2: Multiplication and subtraction
        assertEquals(10, processor.calculateExpression("4 * 5 - 10"), 0.001);

        // Test Case 3: Expression with parentheses
        assertEquals(14, processor.calculateExpression("(2 + 3) * 2 + 4"), 0.001);

        // Test Case 4: Complex expression with division
        assertEquals(3, processor.calculateExpression("18 / 2 - (4 + 1)"), 0.001);

        // Test Case 5: Nested parentheses
        assertEquals(6, processor.calculateExpression("((3 + 5) - 2) / 2"), 0.001);
    }
}
