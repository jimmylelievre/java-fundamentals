import fr.aelion.user.LoginManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginManagerTest {
    public LoginManager loginManager;

    @BeforeEach
    public void setup() {
        this.loginManager = new LoginManager("bond", "007");
    }

    @Test
    @DisplayName("Login and password should be 'bond' and '007'")
    public void haveCredentials() {
        assertAll("Credentials",
                () -> assertEquals("bond", this.loginManager.getLogin()),
                () -> assertEquals("007", this.loginManager.getPassword()));
    }

    @Test
    @DisplayName("Should return 200 ok if credendials was good")
    public void goodCredentials() {
        assertEquals("200 ok", this.loginManager.login());

    }

    @Test
    @DisplayName("Should return 404 Not Found if credendials was bad")
    public void badCredentials() {
        LoginManager loginManager = new LoginManager("toto", "tata");
        assertEquals("404 Not Found", loginManager.login());

    }
}
