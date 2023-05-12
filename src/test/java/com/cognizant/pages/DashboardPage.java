package com.cognizant.pages;

import com.cognizant.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;

import javax.xml.xpath.XPath;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath="//ul[@role='menubar']/li/a[@aria-label='Careers']")
    public WebElement careerModule;


    @FindBy (xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement acceptAllCookies;


    public void cookiePolicy(){
        DashboardPage dashboardPage = new DashboardPage();
        if (dashboardPage.acceptAllCookies.isDisplayed()){
            dashboardPage.acceptAllCookies.click();
        }
    }








}
