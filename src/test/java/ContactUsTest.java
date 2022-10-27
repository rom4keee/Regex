import Pages.ContactUs;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ContactUsTest extends BasicTest{
    ContactUs contactUsPage = new ContactUs(BasicTest.chromeDriver);
    Map<String, String> epamAddress = ContactUs.getAddress();

    @Test
    void verifyAddressMatchesRegex() {
        ContactUs.getAddress();
        assertTrue(ContactUs
                .getAddressString()
                .matches(ContactUs.ADDRESS));
    }
    @Test
    void verifyStreetMatchesGivenValue() {
        assertEquals("41 University Drive", epamAddress.get("Street:"));
    }
    @Test
    void verifyApartmentMatchesGivenValue() {
        assertEquals("Suite 202", epamAddress.get("Apartment:"));
    }
    @Test
    void verifyCityMatchesGivenValue() {
        assertEquals("Newtown", epamAddress.get("City:"));
    }
    @Test
    void verifyStateMatchesGivenValue() {
        assertEquals("PA", epamAddress.get("State:"));
    }
    @Test
    void verifyPostalCodeMatchesGivenValue() {
        assertEquals("18940", epamAddress.get("Postal Code:"));
    }
    @Test
    void verifyCountryMatchesGivenValue() {
        assertEquals("USA", epamAddress.get("Country:"));
    }
}