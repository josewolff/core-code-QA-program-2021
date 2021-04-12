package systemTesting;

import io.appium.java_client.remote.MobileCapabilityType;
import org.json.JSONObject;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.FilesManager;

public class GridCapabilities {

    private String FILEROUTE = "src/main/resources/browsersConfig/browserConfig.json";

    public DesiredCapabilities getCapabilities(String gridBrowser){
        DesiredCapabilities capabillities = new DesiredCapabilities();
        JSONObject browsersConfigFile = new JSONObject(FilesManager.readFile(FILEROUTE));
        if (browsersConfigFile.has(gridBrowser)) {
            JSONObject configuration = browsersConfigFile.getJSONObject(gridBrowser);
            if (gridBrowser.contains("firefox")){
                capabillities =  DesiredCapabilities.firefox();
                capabillities.setPlatform(Platform.LINUX);
                capabillities.setVersion(configuration.getString("version"));
                capabillities.setBrowserName(configuration.getString("browserName"));
            }else if (gridBrowser.contains("chrome")){
                capabillities =  DesiredCapabilities.chrome();
                capabillities.setPlatform(Platform.LINUX);
                capabillities.setVersion(configuration.getString("version"));
                capabillities.setBrowserName(configuration.getString("browserName"));
            }
        }
        return capabillities;
    }

    public DesiredCapabilities getiPhoneCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "safari");
        return desiredCapabilities;
    }
}
