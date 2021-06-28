package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import java.util.List;

public class CartPage extends PageObject {

    @FindBy(css = "[data-title='Product']")
    private WebElementFacade productsFromCartName;

    @FindBy(css = ".remove")
    private WebElementFacade removeItemFromCartLink;

    @FindBy(className = "product-name")
    private List<WebElementFacade> cartProductsList;

    @FindBy(className = "product-remove")
    private List<WebElementFacade> xList;

    @FindBy(css = "[role='alert']")
    private WebElementFacade itemRemovedMessage;
    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;
    @FindBy(css = ".product-remove > .remove")
    private WebElementFacade xButtons;
    @FindBy(css = ".woocommerce .cart_item [step]")
    private List<WebElementFacade> quantityThings;

    @FindBy(css = "button[name='update_cart']")
    private WebElementFacade updateCartButton;
    @FindBy(css = ".cart-empty")
    private WebElementFacade cartEmptyText;

    public CartPage() {
    }

    public void checkIfItemIsInCart(String itemName) {
        productsFromCartName.shouldContainOnlyText(itemName);
    }


    public void findItemInListAndDelete(String name) {

        for (int i = 0; i < cartProductsList.size(); i++) {
            String item = (cartProductsList.get(i).getText());
            if (item.equals(name)) {

                xList.get(i).click();
            }
        }
    }

    public void removeMessageCheck(String text) {
        itemRemovedMessage.shouldContainOnlyText(text);
    }

    public void emptyCartList() {

            for (WebElementFacade quantityThing : quantityThings) {
                typeInto(quantityThing, "0");
            }
        clickOn(updateCartButton);
    }



    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void removeItemFromCart() {
        clickOn(removeItemFromCartLink);
    }

    public void emptyCartMessage() {
        cartEmptyText.shouldContainOnlyText("Your cart is currently empty.");
    }
}
