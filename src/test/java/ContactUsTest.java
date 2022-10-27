import Pages.ContactUs;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ContactUsTest extends BasicTest{
    ContactUs contactUsPage = new ContactUs(BasicTest.chromeDriver);
    Map<String, String> epamAddress = ContactUs.getAddress();

    @Test
    void verifyAddressStringMatcher() {
        ContactUs.getAddress();
        assertTrue(ContactUs
                .getAddressString()
                .matches(ContactUs.ADDRESS));
    }
    @Test
    void verifyStreet() {
        assertEquals("41 University Drive", epamAddress.get("Street:"));
    }
    @Test
    void verifyApartment() {
        assertEquals("Suite 202", epamAddress.get("Apartment:"));
    }
    @Test
    void verifyCity() {
        assertEquals("Newtown", epamAddress.get("City:"));
    }
    @Test
    void verifyState() {
        assertEquals("PA", epamAddress.get("State:"));
    }
    @Test
    void verifyPostalCode() {
        assertEquals("18940", epamAddress.get("Postal Code:"));
    }
    @Test
    void verifyCountry() {
        assertEquals("USA", epamAddress.get("Country:"));
    }
}