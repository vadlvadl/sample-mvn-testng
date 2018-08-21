package pages;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private String pageUrl = "http://demoqa.com/";

    public void navigate(){
        open(pageUrl);
    }


}
