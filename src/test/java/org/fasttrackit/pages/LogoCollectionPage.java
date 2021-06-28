package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class LogoCollectionPage extends PageObject {
    @FindBy(css = "input[name='quantity[46]']")
    private WebElementFacade hoodieWithLogoQuantity;
    @FindBy(css = "input[name='quantity[47]']")
    private WebElementFacade tShirtQuantity;
    @FindBy(css = "input[name='quantity[48]']")
    private WebElementFacade beanieQuantity;
    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCArtButton;
    @FindBy(css = "main#main > div[role='alert']")
    private WebElementFacade productsAddedMessage;
    public void setQuantityOnProducts(String hoodieQuantity, String ttShirtQuantity, String bbeanieQuantity){
        typeInto(hoodieWithLogoQuantity,hoodieQuantity);
        typeInto(tShirtQuantity,ttShirtQuantity);
        typeInto(beanieQuantity,bbeanieQuantity);

    }
    public void clickAddToCartButton(){
        clickOn(addToCArtButton);
    }

    public void itemsAddedMessageCheck(String message){
        WebElementFacade productsAddedToCart = this.productsAddedMessage;
        String verificationMessage = productsAddedToCart.getText().replaceAll("View cart", "");
        Assert.assertTrue(verificationMessage.contains(message));

    }
}
