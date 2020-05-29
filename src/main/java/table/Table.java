package table;


import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class Table {



    protected String tableSelector;

    public Table(String tableName) {
        tableSelector = "//div[@class='example'][./*[@class='ui header'][text()='"+tableName+"']]/table";
        $x(tableSelector).shouldBe(Condition.visible).scrollTo();
    }

    public Table() {
    }

    public String getStatus(String rowName){
        NameColumn nameColumn = new NameColumn();
        String status =  new StatusColumn(nameColumn.getRowPositionByName(rowName)).status();
        return status;
    }

    public String getNotes(String rowName) {
        NameColumn nameColumn = new NameColumn();
        String notes = new NotesColumn(nameColumn.getRowPositionByName(rowName)).notes();
        return notes;
    }

    public void checkWarningsInRow(String tableName, String rowName){
        String locatorRow = "(//div[@class='example'][./*[@class='ui header'][text()='"+tableName+"']]/table/tbody/tr[./td[text()='"+rowName+"']])";
        $x(locatorRow).shouldHave(Condition.cssClass("attention"));
    }




}
