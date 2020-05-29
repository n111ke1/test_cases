package table;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class NameColumn extends Table {

    private ElementsCollection nameLocators = $$x(tableSelector + "/tbody//td[1]");
    SelenideElement userName;

    public void getRowByName(String name){
         userName =nameLocators.findBy(Condition.text(name));
    }

    public int getRowPositionByName(String name){
        getRowByName(name);
        int pos = nameLocators.indexOf(userName) +1;
        return pos;
    }

}
