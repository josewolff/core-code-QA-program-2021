package cucumberTests.driversInitTemp;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import systemTesting.GridCapabilities;

import java.net.URL;

public class CucumberDriver {


    private WebDriver driver;
    private String geckoDriver;
    private String chromeDriver;

    public WebDriver initDriver(String runOn) {
        try {
            selectDriverBasedOnOs();
            if (runOn.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", geckoDriver);

                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } else {
                if (runOn.equals("chrome")) {
                    System.setProperty("webdriver.chrome.driver", chromeDriver);
                    DesiredCapabilities caps = DesiredCapabilities.chrome();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments(new String[]{"--start-maximized"});
                    options.merge(caps);
                    driver = new ChromeDriver(options);

                } else if (runOn.equals("ie")) {
                    System.setProperty("webdriver.ie.driver", "drivers/windows/IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    driver.manage().window().maximize();
                } else if (runOn.equals("safari")) {
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                }  else if (runOn.equalsIgnoreCase("appium")) {
                    GridCapabilities gridCapabilities = new GridCapabilities();
                    URL url = new URL("http://127.0.0.1:4723/wd/hub");
                    driver = new IOSDriver(url, gridCapabilities.getiPhoneCapabilities());
                }
            }
            return driver;
        } catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private void selectDriverBasedOnOs(){
        String operativeSystem = System.getProperty("os.name").toLowerCase();
        System.out.println(operativeSystem);
        if(operativeSystem.contains("mac")){
            geckoDriver = "drivers/mac/geckodriver";
            chromeDriver = "drivers/mac/chromedriver";
        }else if(operativeSystem.contains("windows")){
            geckoDriver = "drivers/windows/geckodriver.exe";
            chromeDriver = "drivers/windows/chromedriver.exe";
        }
    }
}
