package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import table.Table;

public class Tests extends BaseTest {

    private String statusValue;
    private String notesValue;

   /**Test 1**/
    @Test
    public void checkTableData(){
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
    public void checkWarningIcon(){

    }



}
