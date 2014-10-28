import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(format=["pretty",
                         "html:build/reports/cucumber"],
                 features=["src/test/cucumber"],
                 strict = true)
public class RunCukesTest {
    //I am a lonely, empty POGO
}