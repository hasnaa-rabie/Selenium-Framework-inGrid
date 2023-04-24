package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement UsernameTXTbox;

    @FindBy(id = "password")
    WebElement PasswordTXTbox;

    @FindBy(id = "kc-login")
    WebElement LoginBTN;

    public void UserLogin(String username, String password)
    {
        setTxtInElementTxtBox(UsernameTXTbox, username);
        setTxtInElementTxtBox(PasswordTXTbox, password);
        clickButton(LoginBTN);
    }

}
