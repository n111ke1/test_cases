package table;

import static com.codeborne.selenide.Selenide.$x;

public class NotesColumn extends Table {
    private int rowByName;
    private String notesLocator = "("+tableSelector +"/tbody//td[3])";

    public NotesColumn(int rowByName) {
        this.rowByName = rowByName;
    }

    public String notes(){
        return  $x(notesLocator+"["+rowByName+"]").getText();
    }


}

