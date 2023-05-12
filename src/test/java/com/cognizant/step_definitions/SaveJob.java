package com.cognizant.step_definitions;

import com.cognizant.pages.CareersPageSearch;
import com.cognizant.pages.DashboardPage;
import com.cognizant.utilities.ConfigReader;
import com.cognizant.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SaveJob {

    DashboardPage dashboardPage = new DashboardPage();
    CareersPageSearch careersPageSearch = new CareersPageSearch();



    @Given("the user is on the Cognizant main page")
    public void the_user_is_on_the_cognizant_main_page() throws InterruptedException {

//        Driver.getDriver().get(ConfigReader.getProperty("url"));
//        Thread.sleep(2000);

        
        Driver.getDriver().navigate().to("https://practice.cydeo.com");



    }
    @Given("the user clicks on the Careers module")
    public void the_user_clicks_on_the_careers_module() throws InterruptedException {

//        if (dashboardPage.acceptAllCookies.isDisplayed()) {
//            dashboardPage.acceptAllCookies.click();
//        }
//
//        dashboardPage.careerModule.click();
//        Thread.sleep(2000);

    }

    @When("the user searches for {string} in {string}")
    public void the_user_searches_for_in(String jobTitle, String location) throws InterruptedException {


//        WebElement acceptCookieSetting = Driver.getDriver().findElement(By.xpath("//button[@class='btn primary-button au-target'][2]"));
//        acceptCookieSetting.click();
//
//        Thread.sleep(3000);
//
//            careersPageSearch.jobTitleInputBox.sendKeys(jobTitle);
//
//            Thread.sleep(3000);
//
//            careersPageSearch.cityInputBox.sendKeys(location);
//
//            Thread.sleep(3000);


    }

    @When("the user clicks the find jobs button")
    public void the_user_clicks_the_find_jobs_button() {

//        careersPageSearch.findJobsButton.click();



    }
    @Then("the user should see the search results")
    public void the_user_should_see_the_search_results() {



    }
    @Then("the user selects the first available job position")
    public void the_user_selects_the_first_available_job_position() {

    }
    @Then("the user should see the job description")
    public void the_user_should_see_the_job_description() {

    }
    @Then("the user selects the save job button")
    public void the_user_selects_the_save_job_button() {

    }
    @When("the user clicks on the saved jobs module")
    public void the_user_clicks_on_the_saved_jobs_module() {

    }
    @Then("the user should be able to see the saved {string}")
    public void the_user_should_be_able_to_see_the_saved(String string) {

    }


}
