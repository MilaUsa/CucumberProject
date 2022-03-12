package runners.weborder;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Runner class is a way run your all feature files from here
//@RunWith annotation comes from Junit and it execute the feature file steps
//Cucumber options is a special annotation that have some key words
//features:this is the location of feature files(this one should be content root
//glue: this is the location of step definition(this one should be source root and delete. java part to make it more general)
//dryRun:this is a way to get snips without executing the whole implementations.
//it means if you make it true , you will get immediately unimplemented snips.
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features/com.weborder",//this is path for feature files
        glue = "stepdefinitions/webordersteps",//this is path for step definitions
        dryRun = false
)


public class WebOrderRunner {

}
