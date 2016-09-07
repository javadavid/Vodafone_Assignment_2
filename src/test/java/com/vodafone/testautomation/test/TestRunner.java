package com.vodafone.testautomation.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
 glue = {"com.vodafone.testautomation.src"},
 plugin = { "pretty",
 "html:target/cucumber-html-report" },
 tags = {})


public class TestRunner {
 
}