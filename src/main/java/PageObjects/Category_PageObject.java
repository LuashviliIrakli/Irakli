package PageObjects;
import WebDriver.BrowserData;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
public class Category_PageObject implements BrowserData {
    public static SelenideElement
            computerTechnicButton = $(".dropdown-toggle > span", 0),
            noteBookButton = $(".overlay", 12),
            addBasketButton = $(".add_to_cart", 0),
            buyButton = $(".add-checkout", 0),
            comparisonButton = $(".Product", 0),
            clearButton = $(".mob-clear"),
            productName = $(".sm-center > p:nth-child(3)",0), //პროდუქტის მოდელი დასახელებაში.
            productNameClick = $(".sm-center >a:nth-child(1) >h2 > span:nth-child(1)"), // მთავარი დასახელება, example ლეპტოპები...
            priceMin = $("#min"),
            priceMax = $("#max"),
            priceFilter = $(".brand-sorts > li > .btn-darkred"),
            productNotFoundTitle = $(".notItemFound"),
            appleCheckBox = $(".custom-control-label",1),
            productPrice = $(".price-section > span:nth-child(1)",0),
            insideProductName = $("h1.txt-grey.h5_css"),
            insideProductSubName = $("p.d-xs-none"),
            insideProductPrice = $(".realPriceSection"),
            insideProductCount = $("[name=quantity]"); //ამაზე დამჭირდება getValue
}
