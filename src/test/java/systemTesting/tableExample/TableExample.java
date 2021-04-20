package systemTesting.tableExample;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTesting.pomSolid.CreateAccountModelActions;
import systemTesting.tables.TableActions;
import utils.GlobalVariables;

public class TableExample extends InitDriver {

    private TableActions tableActions;

    @BeforeClass(alwaysRun = true)
    public void goToPage(){
        driver.get(GlobalVariables.seleniumHost +"/tables.html");
        tableActions = new TableActions(driver,wait);
    }

    @Test(groups = {"table-test"})
    public void createAccountTest() {
        System.out.println(GlobalVariables.seleniumHost);
        tableActions.readTableContent();
    }
}
