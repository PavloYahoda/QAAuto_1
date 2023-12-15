package pyah.webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage{

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    private WebElement tileElements;

    @FindBy(id = "item-0")
    private WebElement textBox;

    @FindBy(id = "userName")
    private WebElement fullName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submitButton;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public MainPage clickByClick (String fullNameValue, String emailValue, String currentAddressValue, String permanentAddressValue){
        tileElements.click();
        textBox.click();
        fullName.sendKeys(fullNameValue);
        email.sendKeys(emailValue);
        currentAddress.sendKeys(currentAddressValue);
        permanentAddress.sendKeys(permanentAddressValue);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        submitButton.click();
        return this;
    }


}
