package stepdefinitions.webordersteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.CreateGrouporderPage;
import pages.weborderpages.LoginPage;
import pages.weborderpages.OrederPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class OrderSteps {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage= new LoginPage(driver);
    OrederPage orederPage=new OrederPage(driver);
    CreateGrouporderPage createGrouporderPage=new CreateGrouporderPage(driver);
    @Given("the user is on weborder homepage")
    public void the_user_is_on_weborder_homepage() {
     driver.get(ConfigReader.readProperty("weborderurl"));
     loginPage.login(ConfigReader.readProperty("weborderusername"),ConfigReader.readProperty("weborderpassword"));
    }

    @When("the user select {string} options")
    public void the_user_select_options(String deliveryoption) {
        orederPage.getdeliveryOption(deliveryoption);
//        orederPage.clickGrouporder();
//        orederPage.clickNextButton();


    }
    @When("the user is on the groupOrderPage")
    public void the_user_is_on_the_group_order_page() {
        orederPage.clickGrouporder();
        orederPage.clickNextButton();
        Assert.assertEquals(driver.getTitle(), "Create Group Order - Weborder");

    }
    @When("the user sends invitees note {string}")
    public void the_user_sends_invitees_note(String inviteNote) {
        createGrouporderPage.sendInviteNote(inviteNote);

    }
    @When("the user sends invite list {string} and {string}")
    public void the_user_sends_invite_list_and(String email1, String email2) {
     createGrouporderPage.sendInviteList(email1+","+email2);
    }

    @Then("the user validates the {string} address")
    public void the_user_validates_the_address(String expectedAddress) {
        Assert.assertTrue(createGrouporderPage.getOfficeAddress().contains(expectedAddress));

    }
    @Then("the user validates {string} text")
    public void the_user_validates_text(String expectedText) throws InterruptedException {
        createGrouporderPage.clickCreateGroupByn();
        Assert.assertEquals(createGrouporderPage.getHeaderText(),expectedText);

    }
    @Then("the user validates total participants is {int}")
    public void the_user_validates_total_participants_is(int expectedParticipant) {
     Assert.assertEquals(createGrouporderPage.getParticipant(),expectedParticipant);
    }

}
