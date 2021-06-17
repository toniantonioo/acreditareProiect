package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.MeniuShopPage;
import org.fasttrackit.pages.TestItemPage;

public class ProductSteps {

    private TestItemPage itemPage;
private MeniuShopPage meniuShopPage;

    @Step
    public void clickTestItem(){
    meniuShopPage.clickTestItemLink();
    }
    @Step
    public void changeQuantityOfProduct(String value){
        itemPage.setQuantityInput(value);

    }
    @Step
    public void clickAddToCartButton(){
        itemPage.clickAddToCartButton();
    }
    @Step
    public  void verificationMessageCheck(String message){
        itemPage.checkVerificationMessageContains(message);
    }
}
