package priya5;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty","html:src\\test\\java\\priya5/cucumber-reports"})
public class demo3 {

}
