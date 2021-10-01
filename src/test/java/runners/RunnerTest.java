package runners;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report"},
		features = "src/test/resources/features",
		glue = "stepDefinitions",
//		tags = "@Actions",
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false
		)

public class RunnerTest {

	
	
	
}
