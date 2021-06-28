package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MeniuShopPage extends PageObject {
    @FindBy(css = "select[name='orderby']")
    private WebElementFacade sortByDropdown;
    @FindBy(css = "[data-product_id='3370']")
    private WebElementFacade addToCartTestProdus;
    @FindBy(css = ".fa-shopping-cart")
    private WebElementFacade cartButton;
    @FindBy(css = "[data-product_id='75']")
    private WebElementFacade singleProduct;
    @FindBy(css = "[data-product_id='46']")
    private WebElementFacade hoodieWithLegoProduct;
    @FindBy(css = "[data-product_id='47']")
    private WebElementFacade tShirtProduct;
    @FindBy(css = ".first.instock.post-3370")
    private WebElementFacade testItemlink;
    @FindBy(css = ".button.product_type_grouped")
    private WebElementFacade logoCollectionButton;

    public void setSortByDropdown(String value) {
        sortByDropdown.selectByValue(value);
    }

    public void clickAddToCartProduct() {
        clickOn(addToCartTestProdus);
    }

    public void clickCartButton() {
        clickOn(cartButton);
    }

    public void clickSingleProduct() {
        clickOn(singleProduct);
    }

    public void clickHoodieWithLegoProduct() {
        clickOn(hoodieWithLegoProduct);

    }

    public void clickTShirtProduct() {
        clickOn(tShirtProduct);

    }

    public void clickTestItemLink() {
        clickOn(testItemlink);
    }

    public void clickLogoCollectionButton() {
        clickOn(logoCollectionButton);
    }

}

