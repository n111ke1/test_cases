package checkBox;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage {
    private String baseLocator = "//div[@class='example'][./*[@class='ui header']";
    private String checkBoxLocator = baseLocator + "[text()='Checkbox']]//*[contains(@class,'checkbox')]";
    private String radioLocator = "//div[@class='another example'][./*[@class='ui form']]//*[contains(@class,'inline')]//*[contains(@class,'radio')]";
    private String sliderLocator = baseLocator + "[text()='Slider']]//*[contains(@class,'slider')]";
    private String toggleLocator = baseLocator + "[text()='Toggle']]//*[contains(@class,'toggle')]";


    public void clickOnCheckBox(){
        $x(checkBoxLocator+"/label").scrollTo().click();
        $x(checkBoxLocator).shouldHave(Condition.cssClass("checked"));
    }

    public void clickOnRadioBtn(String nameOfRadio){
        ElementsCollection radio = $$x(radioLocator+"/label");
        radio.findBy(Condition.text(nameOfRadio)).scrollTo().click();
        radio.findBy(Condition.text(nameOfRadio)).parent().shouldHave(Condition.cssClass("checked"));
    }

    public void clickOnSlider(){
        $x(sliderLocator+"/label").scrollTo() .click();
        $x(sliderLocator).shouldHave(Condition.cssClass("checked"));
    }

    public void clickOnToggle(){
        $x(toggleLocator+"/label").scrollTo() .click();
        $x(toggleLocator).shouldHave(Condition.cssClass("checked"));
    }

}
