package pages;

import elements.DropdownList;
import elements.InputField;
import elements.TextareaField;
import models.AccountModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAccountPage extends BasePage{

    private By SEARCH_INPUT = By.xpath("//article[contains(., 'New Account')]//label[contains(., 'Account Name')]/following-sibling::div//input");
    private By SAVE_BUTTON = By.xpath("//button[@title='Save']");




    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void sendAccountDataModel(AccountModel accountModel) {
        driver.findElement(SEARCH_INPUT).sendKeys(accountModel.getAccountName());
        new InputField(driver, "Phone").inputText(accountModel.getPhone());
        new InputField(driver, "Fax").inputText(accountModel.getFax());
        new InputField(driver, "Website").inputText(accountModel.getWebsite());
        new InputField(driver, "Employees").inputText(accountModel.getEmployees());
        new InputField(driver, "Annual Revenue").inputText(accountModel.getRevenue());
        new TextareaField(driver, "Description").inputText(accountModel.getDescription());
        new TextareaField(driver, "Billing Street").inputText(accountModel.getBillingStreet());
        new TextareaField(driver, "Shipping Street").inputText(accountModel.getShippingStreet());
        new DropdownList(driver, "Type").selectOption(accountModel.getType());
        new DropdownList(driver, "Industry").selectOption(accountModel.getIndustry());
        new InputField(driver, "Billing City").inputText(accountModel.getBillingCity());
    }



    public void saveButtonClick() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
