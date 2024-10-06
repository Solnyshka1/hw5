package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    @Test
    public void testIsStrongPassword() {
        StringProcessor processor = new StringProcessor();

        assertTrue(processor.isStrongPassword("P@ssw0rd"));
        assertFalse(processor.isStrongPassword("Passw0rd"));
        assertFalse(processor.isStrongPassword("password"));
        assertFalse(processor.isStrongPassword("P@ssword"));
        assertFalse(processor.isStrongPassword("p@ssw0rd"));
    }

    @Test
    public void testCalculateDigits() {
        StringProcessor processor = new StringProcessor();

        assertEquals(3, processor.calculateDigits("123abc"));
        assertEquals(0, processor.calculateDigits("No digits here"));
        assertEquals(1, processor.calculateDigits("This is digit 1."));
        assertEquals(6, processor.calculateDigits("Phone: +123-456"));
        assertEquals(0, processor.calculateDigits(""));
    }

    @Test
    public void testCalculateWords() {
        StringProcessor processor = new StringProcessor();

        assertEquals(5, processor.calculateWords("The quick brown fox jumps"));
        assertEquals(1, processor.calculateWords("Word"));
        assertEquals(5, processor.calculateWords("The  quick   brown fox jumps"));
        assertEquals(0, processor.calculateWords("     "));
        assertEquals(0, processor.calculateWords(""));
    }

    @Test
    public void testCalculateExpression() {
        StringProcessor processor = new StringProcessor();

        assertEquals(7, processor.calculateExpression("3 + 4"), 0.001);
        assertEquals(10, processor.calculateExpression("4 * 5 - 10"), 0.001);
        assertEquals(14, processor.calculateExpression("(2 + 3) * 2 + 4"), 0.001);
        assertEquals(3, processor.calculateExpression("18 / 2 - (4 + 1)"), 0.001);
        assertEquals(6, processor.calculateExpression("((3 + 5) - 2) / 2"), 0.001);
    }
}
