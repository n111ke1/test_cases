package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import table.Table;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    String url = System.getProperty("baseUrl");
    private String tableUrl = "https://semantic-ui.com/collections/table.html";
    private String dropDownUrl = "https://semantic-ui.com/modules/dropdown.html";
    private String checkBoxUrl = "https://semantic-ui.com/modules/checkbox.html";

    @BeforeMethod
    public void setUp(){
        Configuration.timeout = 8000;
        open(checkBoxUrl);

    }

}
