package dropDown;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class DropDownPage {

    private String baseDropDown = "//div[@class='dropdown example'][./*[@class='ui header'][text()='Selection']]";
    private String selectGenderLocator1 = baseDropDown + "//*[contains(@class,'ui selection dropdown')]";
    private String selectGenderLocator2 = baseDropDown + "/following::div[@class='another dropdown example']//*[contains(@class,'ui dropdown selection')]";
    private String selectFriendsLocator = baseDropDown + "/following::div[@class='another dropdown example']//*[contains(@class,'ui fluid selection')]";

    public void chooseAndCheckInFirstSelector(String gender) {
        $x(selectGenderLocator1).shouldBe(Condition.visible).scrollTo().click();
        $x(selectGenderLocator1+"//*[@class='item'][contains(text(),'"+gender+"')]").click();
        $x(selectGenderLocator1+"//*[@class='text']").shouldHave(Condition.text(gender));

    }

    public void chooseAndCheckInSecondSelector(String gender) {
        $x(selectGenderLocator2).shouldBe(Condition.visible).scrollTo().click();
        $x(selectGenderLocator2+"//*[@class='item'][contains(text(),'"+gender+"')]").click();
        $x(selectGenderLocator2+"//*[@class='text']").shouldHave(Condition.text(gender));
    }

    public void chooseAndCheckInThirdSelector(String name) {
        $x(selectFriendsLocator).shouldBe(Condition.visible).scrollTo().click();
        $x(selectFriendsLocator+"//*[contains(@class,'menu')]//*[@data-value='"+name+"']").click();
        $x(selectFriendsLocator+"//input[@value]").shouldHave(Condition.text(name));
    }

}