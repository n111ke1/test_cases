package checkBox;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage {
    private String baseLocator = "//div[@class='example'][./*[@class='ui header']";
    private String checkBoxLocator = baseLocator + "[text()='Checkbox']]//*[contains(@class,'checkbox')]";
//    private String radioLocator = baseLocator + "[text()='Radio']]//*[contains(@class,'radio')]";
    private String radioLocator = "//div[@class='another example'][./*[@class='ui form']]//*[contains(@class,'inline')]//*[contains(@class,'radio')]";
    private String sliderLocator = baseLocator + "[text()='Slider']]//*[@type='checkbox']";
    private String toggleLocator = baseLocator + "[text()='Toggle']]//*[@type='checkbox']";


    public void clickOnCheckBox(){
        $x(checkBoxLocator+"/label").scrollTo().click();
        $x(checkBoxLocator).shouldHave(Condition.cssClass("checked"));
    }

    public void clickOnRadioBtn(){
        SelenideElement radio = $$x(radioLocator+"/label").get(2);
        radio.scrollTo().click();
        radio.shouldHave(Condition.cssClass("checked"));


    }

}
