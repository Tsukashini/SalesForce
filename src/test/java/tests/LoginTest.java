package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import staticdata.WebData;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void LoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.makeLogin(WebData.USERNAME, WebData.PASSWORD);
        Assert.assertTrue(true);
    }
}
