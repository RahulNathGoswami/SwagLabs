package cucumber.option;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue={"stepDefination","helper"},tags="@Reg2",plugin="json:target/jsonReports/test.json")
public class TestRunner {

}
//manual testing
//Automation
//paymentpage