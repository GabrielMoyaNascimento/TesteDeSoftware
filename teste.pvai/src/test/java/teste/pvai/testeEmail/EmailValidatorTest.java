package teste.pvai.testeEmail;
import org.junit.Test;
import static org.junit.Assert.*;
import teste.pvai.email.EmailValidator;

public class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        String email = "usuario@example.com";
        assertTrue(EmailValidator.isValidEmail(email));
    }

    @Test
    public void testInvalidMissingAtSymbol() {
        String email = "usuarioexample.com";
        assertFalse(EmailValidator.isValidEmail(email));
    }

    @Test
    public void testInvalidMissingUsername() {
        String email = "@example.com";
        assertFalse(EmailValidator.isValidEmail(email));
    }

    @Test
    public void testInvalidMissingDomain() {
        String email = "usuario@";
        assertFalse(EmailValidator.isValidEmail(email));
    }

    @Test
    public void testInvalidInvalidDomainFormat() {
        String email = "usuario@example";
        assertFalse(EmailValidator.isValidEmail(email));
    }
}