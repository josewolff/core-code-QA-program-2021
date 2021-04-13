package systemTesting.tableExample;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTesting.pomSolid.CreateAccountModelActions;
import systemTesting.tables.TableActions;

public class TableExample extends InitDriver {

    private TableActions tableActions;

    @BeforeClass
    public void goToPage(){
        driver.get("http://localhost:7000/tables.html");
        tableActions = new TableActions(driver,wait);
    }

    @Test
    public void createAccountTest() {
        tableActions.readTableContent();
    }
}
