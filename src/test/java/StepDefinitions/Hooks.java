package StepDefinitions;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before()
    {
//
    }

    @After // Cucumber ın Annotation ı
    public void after(Scenario senaryo)
    {
        Driver.quitDriver();
    }
}
