import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import pageobjects.MyPersonalInformationPage;
import utils.WebDriverManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {


    @BeforeEach
    public void setUp() { WebDriverManagement.initializeWebDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverManagement.quitDriver();
    }

    @Test
    public void UpdatePersonalInformationTest() {
        LoginPage.loginWithValidUser();

        MyAccountPage.navigateToMyPersonalInformation();

        MyPersonalInformationPage.updateMyPersonalInformationData();

        MyPersonalInformationPage.validateUpdateInformation();

    }
}
