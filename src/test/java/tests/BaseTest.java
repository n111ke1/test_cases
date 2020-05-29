package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;
import table.Table;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private String tableName;
    private String tableUrl = "https://semantic-ui.com/collections/table.html";

    @BeforeMethod
    public Table setUp(){
        Configuration.timeout = 8000;
        open(tableUrl);
        return new Table(tableName);
    }

}
