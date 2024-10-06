package org.example;

public class StringProcessor {
    public boolean isStrongPassword(String password) {
        return password.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}");
    }

    public int calculateDigits(String sentence) {
        return (int) sentence.chars().filter(Character::isDigit).count();
    }

    public int calculateWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
    }

    public double calculateExpression(String expression) {
        return 0;
    }
}
