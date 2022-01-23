package dikayaav.tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import dikayaav.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

import java.util.Locale;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
    }

    RegistrationPage registrationPage = new RegistrationPage();
    static Faker faker = new Faker(new Locale("ru"));


}
