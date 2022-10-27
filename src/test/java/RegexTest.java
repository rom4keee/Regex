import Regex.StringMathcer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegexTests {
    String emailAddress = "romanb@gmail.com";
    String ipAddress = "123.234.12.9";
    String creditCardNumber = "5149612222222229";

    @Test
    void verifyEmailAddressPatternMatchesRegex() {
        assertTrue(StringMathcer.stringRegexMatcher(emailAddress, StringMathcer.Email));
    }
    @Test
    void verifyIpPatternMatchesRegex() {
        assertTrue(StringMathcer.stringRegexMatcher(ipAddress, StringMathcer.IP));
    }
    @Test
    void verifyCreditCardPatternMatchesRegex() {
        assertTrue(StringMathcer.stringRegexMatcher(creditCardNumber, StringMathcer.Credit_Card));
    }
}