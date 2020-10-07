package appiumTests;

import com.comcast.drivethru.utils.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CalculatorTest {

    static AppiumDriver<MobileElement> driver;

    public static void main (String[] args) {

        try {
            openCalculator();
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void openCalculator() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Micromax HS2");
        capabilities.setCapability("udid","465954ab");
        capabilities.setCapability("platfornName","Android");
        capabilities.setCapability("platformVersion","7.1.2");

        capabilities.setCapability("appPackage","com.myos.calculator2");
        capabilities.setCapability("appActivity","com.myos.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,capabilities);
        System.out.println("Application started..");



    }
}
