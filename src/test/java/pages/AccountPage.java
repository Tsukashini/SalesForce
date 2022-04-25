package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{
    private By ACCOUNT_TAB = By.cssSelector("//span[text()='Accounts']/parent::a");
    private By NEW_BUTTON = By.xpath("//div[text()='New']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

public void openAccountPage() {
        driver.get("https://d5i0000012dffea2.lightning.force.com/lightning/o/Account/list?filterName=Recent");
}

public void newButtonClick() {
        driver.findElement(NEW_BUTTON).click();
}
}
