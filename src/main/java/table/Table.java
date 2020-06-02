package table;


import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

public class Table {


    protected String tableSelector;
    private String tableName;

    public Table(String tableName) {
        this.tableName = tableName;
       String tableSelector = "//div[@class='example'][./*[@class='ui header'][text()='"+tableName+"']]/table";
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

    public void checkWarningsInRow(String rowName){
        String locatorRow = "(//div[@class='example'][./*[@class='ui header'][text()='"+tableName+"']]/table/tbody/tr[./td[text()='"+rowName+"']]/td/i)";
        $x(locatorRow).shouldHave(Condition.cssClass("attention").because("this row dont have any warnings"));
    }




}
