package table;


import static com.codeborne.selenide.Selenide.$x;

public class StatusColumn extends Table {
    private int rowByName;

    private String statusLocator = "("+tableSelector +"/tbody//td[2])";


    public StatusColumn(int rowByName) {
        this.rowByName = rowByName;
    }

    public String status() {
         return  $x(statusLocator+"["+rowByName+"]").getText();
    }
}
