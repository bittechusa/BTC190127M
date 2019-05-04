package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/bittechconsulting/Desktop/BTC190127M/SamplePOM/loginfb.feature",glue= {"com/fb/test"}
,tags= {"@smoke"},dryRun=true,format = {"pretty","html:report","json:reportjson/cucumber.json"})
public class Runner {

}
