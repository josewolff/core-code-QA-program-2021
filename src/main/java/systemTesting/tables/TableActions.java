package systemTesting.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TableActions extends TablesPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public TableActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void readTableContent(){
        System.out.println("################################# headers #################################");
        readHeaders();
        System.out.println("###########################################################################");

        System.out.println("################################# Table COntent #################################");
        readContent();
        System.out.println("#################################################################################");
    }

    private void readHeaders(){
        headers = wait.until(ExpectedConditions.visibilityOfAllElements(headers));
        for (WebElement header: headers){
            System.out.println(header.getText());
        }
    }

    private void readContent(){
        tableContent = wait.until(ExpectedConditions.visibilityOfAllElements(tableContent));
        for (int i = 0; i < tableContent.size(); i ++){
            List<WebElement> tdContents = tableContent.get(i).findElements(By.xpath("td"));
            System.out.println("Row # " + (i+1));
            for (int j = 0; j < tdContents.size(); j ++){
                System.out.println("\t" + tdContents.get(j).getText());
            }
        }
    }
}
