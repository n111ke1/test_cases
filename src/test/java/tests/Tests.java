package tests;

import checkBox.CheckBoxPage;
import dropDown.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import table.Table;

public class Tests extends BaseTest {

    private String statusValue;
    private String notesValue;

   /**Test 1**/
    @Test
    public void checkTableData(){
        new BaseTest().setUp("https://semantic-ui.com/collections/table.html");
        statusValue = new Table("Error")
               .getStatus("Jimmy");
        Assert.assertEquals(statusValue, "Cannot pull data");
        statusValue = new Table("Error")
                .getStatus("No Name Specified");
        Assert.assertEquals(statusValue, "Approved");
        statusValue = new Table("Error")
                .getStatus("Jill");
        Assert.assertEquals(statusValue, "Approved");
        notesValue = new Table("Error").getNotes("No Name Specified");
        Assert.assertEquals(notesValue, "None");
        notesValue = new Table("Error").getNotes("Jill");
        Assert.assertEquals(notesValue, "None");
    }

    @Test
    public void checkTableWarningIcon(){
        new BaseTest().setUp("https://semantic-ui.com/collections/table.html");
        new Table("Warning").checkWarningsInRow("Jimmy");
        new Table("Warning").checkWarningsInRow("Jamie");

    }

    /**Test 2**/
    @Test
    public void selectDropBox(){
        new BaseTest().setUp("https://semantic-ui.com/modules/dropdown.html");
        new DropDownPage().chooseAndCheckInFirstSelector("Female");
        new DropDownPage().chooseAndCheckInSecondSelector("Male");
        new DropDownPage().chooseAndCheckInThirdSelector("christian");
    }

/**Test 3**/

@Test
    public void clickAndCheckSelectElement(){
    new BaseTest().setUp("https://semantic-ui.com/modules/checkbox.html");
    new CheckBoxPage().clickOnCheckBox();
    new CheckBoxPage().clickOnRadioBtn("Once a day");
    new CheckBoxPage().clickOnSlider();
    new CheckBoxPage().clickOnToggle();
}



}
