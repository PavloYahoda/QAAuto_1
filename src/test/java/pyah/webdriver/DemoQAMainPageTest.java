package pyah.webdriver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DemoQAMainPageTest extends BaseTest{

    String fullNameValue = "Jack Black";
    String emailValue = "jackblak@jb.co";
    String currentAddressValue = "113, North street";
    String permanentAddressValue = "9, New Street";

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Click some elements")
    void findAndClick (){
        mainPage.clickByClick(fullNameValue, emailValue, currentAddressValue, permanentAddressValue);
    }
}
