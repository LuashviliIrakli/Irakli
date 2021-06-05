package PageSteps;

import PageObjects.Category_PageObject;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.Should;
import com.codeborne.selenide.commands.WaitUntil;
import org.openqa.selenium.Keys;

public class Category_PageSteps extends Category_PageObject {
    public static void clickComputerTechnicButton(){
        computerTechnicButton.waitUntil(Condition.visible, 2000);
        computerTechnicButton.click();
    }

    public static void clickNoteBookButton(){
        noteBookButton.waitUntil(Condition.visible, 2000);
        noteBookButton.click();
    }

    public static void clickAddBasketButton(){
        addBasketButton.waitUntil(Condition.visible, 2000);
        addBasketButton.click();
    }

    public static void clickBuyButton(){
        buyButton.waitUntil(Condition.visible, 2000);
        buyButton.click();
    }

    public static void clickComparisonButton(){
        comparisonButton.waitUntil(Condition.visible, 2000);
        comparisonButton.click();
    }

    public static void clickClearButton(){
        clearButton.waitUntil(Condition.visible, 2000);
        clearButton.click();
    }

    public static String getProductName(){
        productName.waitUntil(Condition.visible, 2000);
        String noteBookProductName = productName.getText();
        return noteBookProductName;
    }
    public static String getProductNameClick(){
        return productNameClick.getText();
    }

    public static void clickProductName(){
        productNameClick.waitUntil(Condition.visible, 2000);
        productNameClick.click();
    }

    public static void setPriceMin(String minPrice){
        priceMin.waitUntil(Condition.visible, 2000);
        priceMin.sendKeys(Keys.BACK_SPACE);
        Selenide.sleep(3000);
        priceMin.sendKeys(minPrice);
    }

    public static void setPriceMax(String maxPrice){
        priceMax.waitUntil(Condition.visible, 2000);
        priceMax.click();
        priceMax.sendKeys(Keys.DELETE);
        Selenide.sleep(3000);
        priceMax.sendKeys(maxPrice);
        priceMin.click();
    }

    public static void shouldPriceFilter(){
        priceFilter.waitUntil(Condition.visible, 2000);
        priceFilter.shouldBe(Condition.visible);
    }
    public static String getProductPrice(){
        return productPrice.getText();
    }
    public static String getInsideProductName(){
        return insideProductName.getText();
    }
    public static String getInsideProductSubName(){
        return insideProductSubName.getText();
    }
    public static String getInsideProductPrice(){
        return insideProductPrice.getText();
    }
    public static String getInsideProductCount(){
        return insideProductCount.getValue();
    }

    public static String getProductNotFoundTitle(){
        productNotFoundTitle.waitUntil(Condition.visible, 2000);
        String notFound = productNotFoundTitle.getText();
        return notFound;
    }
    public static void addItemBasket(){
        clickComputerTechnicButton();
        clickNoteBookButton();
        clickAddBasketButton();
        Selenide.sleep(1000);
    }
    public static void navigateToProduct(){
        clickComputerTechnicButton();
        clickNoteBookButton();
    }
    public static void clickAppleCheckBob(){
        appleCheckBox.click();
    }
    public static void checkFilterText(){
        priceFilter.getText();
    }

}
