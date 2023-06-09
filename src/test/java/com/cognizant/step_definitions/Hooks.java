package com.cognizant.step_definitions;

import com.cognizant.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

 @After
 public void teardown(Scenario scenario){

    if (scenario.isFailed()){

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenshot, "image/png", "failure_ss");
    }

//    Driver.closeDriver();

 }


}
