package com.cognizant.pages;

import com.cognizant.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPageSearch {

    public CareersPageSearch(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@name='phsKeywords']")
    public WebElement jobTitleInputBox;

    @FindBy (xpath = "//input[@id='locationInput']")
    public WebElement cityInputBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement findJobsButton;

    @FindBy (xpath = "//button[@class='btn primary-button au-target'][2]")
    public WebElement cookieSettingsAllowButton;

    public void cookieSettings(){
        CareersPageSearch careersPageSearch = new CareersPageSearch();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        careersPageSearch.cookieSettingsAllowButton.click();
    }


}
