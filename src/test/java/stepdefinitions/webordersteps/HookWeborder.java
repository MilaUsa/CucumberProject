package stepdefinitions.webordersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverHelper;

public class HookWeborder {

    @Before
    public void beforeScenario(){
        System.out.println("it runs before eachscenario");
    }
    @After
    public void afterScenario(){
       DriverHelper.tearDown();
        System.out.println("it runs after eachScenario");
    }
}
