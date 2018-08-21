import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.title;

public class LoadMainPageTest {

    @BeforeTest
    public void setup(){
        Configuration.browser = "chrome";
    }
    @Test
    public void loadMainPage(){
        MainPage page = new MainPage();
        page.navigate();

        Assert.assertEquals(title().contentEquals("Demoqa | Just another WordPress site"),true);
    }
}
