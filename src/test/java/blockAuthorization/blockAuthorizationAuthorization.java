package blockAuthorization;
import Pages.StartPage.StartPageBlockAuthorization;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class blockAuthorizationAuthorization {

    @Before
    @BeforeClass
    public void openStartPage (){
        Configuration.browser = "Firefox";
        Configuration.baseUrl = "https://vk.com/";
        open("");

    }

    @Test
    public void homePageAuthorization (){
        StartPageBlockAuthorization startPage = new StartPageBlockAuthorization();
        startPage.validAuthorization();
        startPage.getHomePage();
        startPage.validHomePage().shouldBe(Condition.visible);

    }

}
