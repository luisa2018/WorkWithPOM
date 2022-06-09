package runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/googletranslate.feature",
        glue ="stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class GoogleTranslateRunner {
}
