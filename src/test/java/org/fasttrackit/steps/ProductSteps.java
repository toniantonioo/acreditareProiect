package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.LogoCollectionPage;
import org.fasttrackit.pages.MeniuShopPage;
import org.fasttrackit.pages.TestItemPage;

public class ProductSteps {

    private TestItemPage itemPage;
    private MeniuShopPage meniuShopPage;
    private LogoCollectionPage logoCollectionPage;

    @Step
    public void clickTestItem() {
        meniuShopPage.clickTestItemLink();
    }

    @Step
    public void changeQuantityOfProduct(String value) {
        itemPage.setQuantityInput(value);

    }

    @Step
    public void clickAddToCartButton() {
        itemPage.clickAddToCartButton();
    }

    @Step
    public void verificationMessageCheck(String message) {
        itemPage.checkVerificationMessageContains(message);
    }

    @Step
    public void clickLogoCollectionDetailsButton() {
        meniuShopPage.clickLogoCollectionButton();
    }

    @Step
    public void addQuantityToProducts(String hoodieQuantity, String tShirtQuantity, String beanieQuantity) {
        logoCollectionPage.setQuantityOnProducts(hoodieQuantity,tShirtQuantity,beanieQuantity);

    }
    @Step
    public void clickAddToCartLogoCollection(){
        logoCollectionPage.clickAddToCartButton();
    }
    @Step
    public void checkProductsAreAdded(String message){
        logoCollectionPage.itemsAddedMessageCheck(message);
    }
}
