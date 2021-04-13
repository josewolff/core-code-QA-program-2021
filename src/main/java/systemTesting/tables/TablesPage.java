package systemTesting.tables;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TablesPage {

    @FindBy(id = "dataTable")
    protected WebElement table;

    @FindBy(xpath = "//table/thead/tr/th[contains(@class,'sorting')]")
    protected List<WebElement> headers;

    @FindBy(xpath = "//tbody/tr[contains(@role,'row')]")
    protected List<WebElement> tableContent;
}
