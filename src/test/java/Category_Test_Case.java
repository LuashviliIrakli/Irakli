import PageObjects.Category_PageObject;
import PageSteps.Category_PageSteps;
import WebDriver.BrowserData;
import WebDriver.DriverRunner;
import com.codeborne.selenide.Selenide;
import com.sun.jdi.event.StepEvent;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Security;

public class Category_Test_Case extends Category_PageSteps {
    @Test
    @Description("checkProductInfo")
    @Severity(SeverityLevel.CRITICAL)
    public void checkProductInfo() throws Exception {
        DriverRunner.runner(chromeBrowser,defaultURL);
        clickComputerTechnicButton();
        clickNoteBookButton();
        String saveNameClick = getProductNameClick();
        String saveName = getProductName();
        String savePrice = getProductPrice();
        clickProductName();
        Assert.assertEquals(saveNameClick,getInsideProductName());
        Assert.assertEquals(saveName,getInsideProductSubName());
        Assert.assertEquals(savePrice,getInsideProductPrice());
        Assert.assertEquals("1",getInsideProductCount());
    }
    @Test
    @Description("checkFilter")
    @Severity(SeverityLevel.NORMAL)
    public void checkFilter() throws Exception{
        DriverRunner.runner(chromeBrowser,defaultURL);
        clickComputerTechnicButton();
        clickNoteBookButton();
        Selenide.sleep(3000);
        setPriceMin("1");
        setPriceMax("2");
        Selenide.sleep(3000);
        shouldPriceFilter();
    }
    @Test
    @Description("checkCheckBox")
    @Severity(SeverityLevel.NORMAL)
    public void checkCheckBox() throws Exception{
        DriverRunner.runner(chromeBrowser,defaultURL);
        clickComputerTechnicButton();
        clickNoteBookButton();
        clickAppleCheckBob();
        Selenide.sleep(2000);
        checkFilterText();

    }
}
