package tests;


import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public void setUp(String url){
        open(url);
    }

}
