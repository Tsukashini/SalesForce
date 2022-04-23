package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CreateNewAccountPage;
import pages.LoginPage;
import staticdata.WebData;
import testdata.GetNewAccountModel;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void LoginTest() {
        loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.makeLogin(WebData.USERNAME, WebData.PASSWORD);

        AccountPage accountPage = new AccountPage(driver);
        accountPage.openAccountPage();
        accountPage.newButtonClick();
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);
        createNewAccountPage.sendAccountDataModel(GetNewAccountModel.getAccountWithAllFields());
        createNewAccountPage.saveButtonClick();
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@data-key, 'success')]")).isDisplayed(), "No success message");
    }
}
