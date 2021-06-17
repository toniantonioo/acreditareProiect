package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class TestItemPage extends PageObject {

    @FindBy(css = "input[name='quantity']")
    private WebElementFacade quantityInput;
    @FindBy(css = "button[name='add-to-cart']")
    private WebElementFacade addToCartButton;
    @FindBy(css = "main#main > div[role='alert']")
    private WebElementFacade addToCartVerificationMessage;

    public void setQuantityInput(String value) {
        typeInto(quantityInput, value);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

    public void checkVerificationMessageContains(String message){
        WebElementFacade addToCartVerificationMessage = this.addToCartVerificationMessage;
      String verificationMessage = addToCartVerificationMessage.getText().replaceAll("View cart", "");
       Assert.assertTrue(verificationMessage.contains(message));
    }
}
