package WebDriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverRunner implements BrowserData {
    public static void runner (String browserName, String url) throws Exception {
        if (browserName == "chrome"){
            WebDriverManager.chromedriver().browserVersion(chromeVersion);
            Configuration.browser = "Chrome";
            Configuration.startMaximized = true;
            Selenide.open(url);
        }
        else if (browserName == "edge"){
            WebDriverManager.edgedriver().browserVersion(edgeVersion);
            Configuration.browser = "edge";
            Configuration.startMaximized = true;
            Selenide.open(url);
        }
        else {
            throw new Exception("გთხოვთ, გადმოგვცეთ ბრაუზერის სახელი (chrome ან edge)");

        }
    }
}
