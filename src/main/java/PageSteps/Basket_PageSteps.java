package PageSteps;

import PageObjects.Basket_PageObject;
import com.codeborne.selenide.Condition;

public class Basket_PageSteps extends Basket_PageObject {
    public static void clickBasket() {
        basketButton.waitUntil(Condition.visible, 2000);
        basketButton.click();
    }
    public static String getBasketCount() {
        basketCount.waitUntil(Condition.visible, 2000);
        String basketCountValue = basketCount.getText();
        return basketCountValue;
    }
    public static String checkEmptyBasketTitle() {
        basketEmptyTitle.waitUntil(Condition.visible, 2000);
        String emptyBasketText = basketEmptyTitle.getText();
        return emptyBasketText;
    }
    public static String getBasketProductName(){
        basketProductName.waitUntil(Condition.visible, 2000);
        String productName = basketProductName.getText();
        return productName;
    }
    public static void clickBasketDeleteButton() {
        basketDeletedButton.waitUntil(Condition.visible, 2000);
        basketDeletedButton.click();
    }
    public static void clickBasketSaveButton(){
        basketSavedButton.waitUntil(Condition.visible, 2000);
        basketSavedButton.click();
    }
    public static String getBaketItemQuantity(){
        basketItemQuantity.waitUntil(Condition.visible, 2000);
        String basketItemQuantityValue = basketItemQuantity.getText();
        return basketItemQuantityValue;
    }
    public static void clickBasketItemQuantityMinus(){
        basketItemQuantityMinus.waitUntil(Condition.visible, 2000);
        basketItemQuantityMinus.click();
    }
    public static void clickBasketItemQuantityPlius(){
        basketItemQuantityMinus.waitUntil(Condition.visible, 2000);
        basketItemQuantityPlius.click();
    }
    public static String getBasketProductPrice(){
        basketProductPrice.waitUntil(Condition.visible, 2000);
        String productPriceValue = basketProductPrice.getText();
        return productPriceValue;
    }
    public static String getBasketSumPrice(){
        basketSumPrice.waitUntil(Condition.visible, 2000);
        String sumPrice = basketSumPrice.getText();
        return sumPrice;
    }
    public static String getBasketFullPrice(){
        basketFullPrice.waitUntil(Condition.visible, 2000);
        String fullPrice = basketFullPrice.getText();
        return fullPrice;
    }

}
