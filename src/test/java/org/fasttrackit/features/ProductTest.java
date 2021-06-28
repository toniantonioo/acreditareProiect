package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private ProductSteps produceSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void addMultipleItemsInCart() {

        loginSteps.logInOneStep();
        cartSteps.clickShopLink();
        cartSteps.selectFromDropDown("date");
        produceSteps.clickTestItem();
        produceSteps.changeQuantityOfProduct("4");
        produceSteps.clickAddToCartButton();
        produceSteps.verificationMessageCheck("4 × “testItem” have been added to your cart.");

    }

    @Test
    public void addingProductCollectionInCart() {
        loginSteps.logInOneStep();
        cartSteps.clickShopLink();
        cartSteps.selectFromDropDown("rating");
        produceSteps.clickLogoCollectionDetailsButton();
        produceSteps.addQuantityToProducts("1","1","1");
        produceSteps.clickAddToCartLogoCollection();
        produceSteps.checkProductsAreAdded("“Hoodie with Logo”, “T-Shirt” and “Beanie” have been added to your cart.");
    }


}
