package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownList {
    WebDriver driver;

    String label;

    String dropdownListXpath = "//article[contains(., 'New Account')]//span[contains(., '%s')]/following-sibling::div";

    String optionXpath = "//div[contains(@class, 'uiMenuList') and contains(@class, 'visible')]//li[contains(., '%s')]";

    public DropdownList (WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption (int option) {
        dropdownListXpath = String.format(dropdownListXpath, label);
        driver.findElement(By.xpath(dropdownListXpath)).click();
        List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class, 'uiMenuList') and contains(@class, 'visible')]//li[contains(., '')]"));

        optionXpath = String.format(optionXpath, elements.get(option).getText());
        driver.findElement(By.xpath(optionXpath)).click();
    }
}
