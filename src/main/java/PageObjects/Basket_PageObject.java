package PageObjects;

import WebDriver.BrowserData;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class Basket_PageObject implements BrowserData {
    public static SelenideElement
            basketButton = $(By.className("buttons")).$(By.className("btn-cart")),
            basketCount = $(By.className("buttons")).$(By.className("cart-count")),
            basketEmptyTitle = $(By.className("not_cart_items")), // ცარიელი კალათის შემოწმებისთვის.
            basketProductName = $(By.className("cart-item-title")),
            basketDeletedButton = $(By.className("fa-trash")),
            basketSavedButton = $(By.className("save-icon")),
            basketItemQuantity = $(By.tagName("itemQty")),      // კალათის შიდა გვერდზე, არსებული პროდუქტის რაოდენობის შემოწმება.
            basketItemQuantityMinus = $(By.className("fa-minus")),// კალათის შიდა გვერდზე, არსებული პროდუქტის რაოდენობის შემცირება.
            basketItemQuantityPlius = $(By.className("fa-plus")),   // კალათის შიდა გვერდზე, არსებული პროდუქტის რაოდენობის გაზრდა.
            basketProductPrice = $(By.className("item-activity")).$(By.className("price")), // პროდუქტის ფასი.
            basketSumPrice = $(".block-content.sub-total"),   // პროდუქტის ჯამური ფასი რაოდენობის მიხედვით.
            basketFullPrice = $(".txt-red.price");          // სრული ღირებულება.

}
