package Regex;

public class StringMathcer {
    public static final String Credit_Card = "^5149612222222229$";
    public static final String IP = "\\b(?:(?:2(?:[0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9])\\.){3}(?:(?:2([0-4][0-9]|5[0-5])|[0-1]?[0-9]?[0-9]))\\b";
    public static final String Email = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

    private StringMathcer() {
        throw new IllegalStateException("Utility class");
    }
    public static boolean stringRegexMatcher(String input, String regex) {
        return input.matches(regex);
    }
}
