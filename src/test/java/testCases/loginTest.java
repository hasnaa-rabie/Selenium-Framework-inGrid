package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class loginTest extends TestBase{
    LoginPage loginObject;

    @Test
    public void UserCanLoginSuccessfully()
    {
        loginObject = new LoginPage(driver);
        loginObject.UserLogin("hrabie", "qwerty");
        Assert.assertTrue(driver.getTitle().equals("2.0 DXC Service Status Dashboard"));

    }
}
