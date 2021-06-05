import PageSteps.Basket_PageSteps;
import PageSteps.Category_PageSteps;
import WebDriver.BrowserData;
import WebDriver.DriverRunner;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basket_Test_Case extends Basket_PageSteps {

    @Test
    @Description("checkBasketEmpty")
    @Severity(SeverityLevel.NORMAL)
    public void checkBasketEmpty() throws Exception {
        DriverRunner.runner(chromeBrowser,defaultURL);
         clickBasket();
        Assert.assertEquals(checkEmptyBasketTitle(),"კალათა ცარიელია");
    }
    @Test
    @Description("checkBasketEmpty2")
    @Severity(SeverityLevel.NORMAL)
    public void checkBasketEmpty2() throws Exception {
        DriverRunner.runner(chromeBrowser,defaultURL);
        clickBasket();
        Assert.assertEquals(getBasketCount(), "0");
    }
    @Test
    @Description("checkBasketItem")
    @Severity(SeverityLevel.NORMAL)
    public void checkAddBasketItem() throws Exception {
        DriverRunner.runner(chromeBrowser,defaultURL);
        Category_PageSteps.addItemBasket();
        Assert.assertEquals(getBasketCount(), "1");
    }
    @Test
    @Description("chekBasketItemInfo")
    @Severity(SeverityLevel.CRITICAL)
    public void checkBasketItemInfo() throws Exception{
        DriverRunner.runner(chromeBrowser,defaultURL);
        Category_PageSteps.navigateToProduct();
        String saveName = Category_PageSteps.getProductName();
        String savePrice = Category_PageSteps.getProductPrice();
        Category_PageSteps.addItemBasket();
        clickBasket();
        Assert.assertEquals(saveName, getBasketProductName());
        Assert.assertEquals(savePrice, getBasketProductPrice());
    }

}
