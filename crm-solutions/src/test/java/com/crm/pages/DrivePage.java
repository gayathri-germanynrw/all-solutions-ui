package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DrivePage extends BasePage {

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> allModulesOfDrivePage;

    public void selectModule(String module){

        String locator=  "//*[contains(@class, 'main-buttons-item-link')]//*[.='"+module+"']";

        WebElement optionEl = Driver.getDriver().findElement(By.xpath(locator));
        optionEl.click();


    }

}

