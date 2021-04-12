package systemTesting;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;

import java.net.URL;


public class InitDriver {

    protected WebDriver driver;
    protected WebDriverWait wait;
    private String geckoDriver = "";
    private String chromeDriver = "";

    @BeforeClass(alwaysRun = true)
    public void openDriver(@Optional("appium") String runOn, @Optional("firefox86") String gridBrowser) {
        initDriver(runOn, gridBrowser);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void initDriver(String runOn, String gridBrowser) {
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
                }else if (runOn.equalsIgnoreCase("grid")){
                    GridCapabilities gridCapabilities = new GridCapabilities();
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), gridCapabilities.getCapabilities(gridBrowser));
                }else if(runOn.equalsIgnoreCase("appium")){
                    GridCapabilities gridCapabilities = new GridCapabilities();
                    URL url = new URL("http://127.0.0.1:4723/wd/hub");
                    driver = new IOSDriver(url,gridCapabilities.getiPhoneCapabilities());
                }
            }

            wait = new WebDriverWait(driver, 15,100);
        } catch (Exception var5) {
            var5.printStackTrace();
            Assert.fail("fail to init the browser");
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
