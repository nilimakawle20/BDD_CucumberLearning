package stepdefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)      
@CucumberOptions(
		features="src/test/java/featurefiles/MyScenario1.feature",
		glue= {"stepdefinitions"},
		tags="@test1",
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","html:target/HtmlReport/index.html"}
	)                     
public class TestRunner {
	
}
