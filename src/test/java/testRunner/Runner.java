package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features= {"src/test/java/Featuress"},
		dryRun=!true,
		glue={"steps","hooks"},
		snippets=SnippetType.CAMELCASE,
		monochrome=true,
		plugin ={"pretty",
			"html:target/cucumber-report.html",
			"junit:target/cucumber-report.xml",
			"rerun:target/failures.txt"}
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
