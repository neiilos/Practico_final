package pageobjects;

import utils.WebDriverManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.CommonConstants.INFORMATION_UPDATE_SUCCESFULLY;

public class MyPersonalInformationPage {
    public static void updateMyPersonalInformationData(){
        WebDriverManagement.sendKeysById("firstname", "Pedro");
        WebDriverManagement.sendKeysById("lastname", "Gonzalez");
        WebDriverManagement.sendKeysById("old_passwd", "123456");
        WebDriverManagement.sendKeysById("passwd", "123456");
        WebDriverManagement.sendKeysById("confirmation", "123456");
        WebDriverManagement.clickById("newsletter");
        WebDriverManagement.clickByCssSelector(".button-medium:nth-child(1) > span");
    }

    public static void validateUpdateInformation(){
        assertEquals(INFORMATION_UPDATE_SUCCESFULLY, WebDriverManagement.getElementTextByCss(".alert"));
    }
}
