package com.reportportal.core.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"},
        features = {"src/test/java/com/reportportal/features"},
        glue="steps")
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
