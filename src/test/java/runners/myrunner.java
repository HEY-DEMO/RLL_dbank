package runners;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import listeners.MyRetry;


@CucumberOptions(
    features = {"src/test/resources/features/tharun_signup/sign.feature"}, // Path to your feature files
    glue = {"mystepdefs"} // Package where your step definitions are located
)
public class myrunner extends AbstractTestNGCucumberTests   { 
	
}