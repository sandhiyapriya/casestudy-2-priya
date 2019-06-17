package priya4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags= {"@tag1,@tag3"},monochrome=true,plugin= {"pretty","html:src\\test\\java\\priya4/cucumber-reports"})
public class demo17 {

}
