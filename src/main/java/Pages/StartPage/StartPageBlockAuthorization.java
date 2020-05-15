package Pages.StartPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.*;

public class StartPageBlockAuthorization {

    String validPhone = "89826325319";
    String validPassword = "TestVK321";
    String inValidPassword = "TestVK321";
    String blockIJYourFirstName = "Test";
    String getBlockIJYourLastName = "Auto";

    static SelenideElement blockAuthorizationEmail = $(By.xpath("//*[@id=\"index_email\"]")),
                           blockAuthorizationPassword = $(By.xpath("//*[@id=\"index_pass\"]")),
                           blockAuthorizationButtonLogIn = $(By.xpath("//*[@id=\"index_login_button\"]")),
                           blockAuthorizationLinkForgotPassword = $(By.xpath("//*[@id=\"index_forgot\"]"));



    public void validAuthorization (){
        blockAuthorizationEmail.setValue(validPhone);
        blockAuthorizationPassword.setValue(validPassword);

    }

    public void inValidAuthorization (){
        blockAuthorizationEmail.setValue(validPhone);
        blockAuthorizationPassword.setValue(inValidPassword);

    }

    public StartPageBlockAuthorization getHomePage (){
        blockAuthorizationButtonLogIn.pressEnter();
        return this;
    }
    public SelenideElement validHomePage (){
        return $(By.xpath("//*[@id=\"top_profile_link\"]//div[contains(text(), Test)]"));
    }



}
