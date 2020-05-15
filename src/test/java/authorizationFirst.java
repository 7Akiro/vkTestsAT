import Pages.StartPage.StartPageBlockAuthorization;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class authorizationFirst {
    StartPageBlockAuthorization startPage = new StartPageBlockAuthorization();
    @Given("open start page vk.com")
    public void openStartPageVkCom() {
        Configuration.timeout = 20000;
        Configuration.baseUrl = "https://vk.com/";
        open("");
    }

    @When("set phone number and password, and press log in")
    public void setPhoneNumberAndPasswordAndPressLogIn() {
        startPage.validAuthorization();
        startPage.getHomePage();
    }

    @Then("page Home is open!")
    public void pageHomeIsOpen() {
        startPage.validHomePage().shouldBe(Condition.visible);
    }

    @When("set phone number and password, and press log in \\(invalid password)")
    public void setPhoneNumberAndPasswordAndPressLogInInvalidPassword() {
        startPage.inValidAuthorization();
    }

}
