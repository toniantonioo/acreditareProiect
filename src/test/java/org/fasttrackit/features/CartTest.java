package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void emptyCart() {
        loginSteps.logInOneStep();
        cartSteps.clickCArtButton();
        cartSteps.empyCart();

    }

    @Test
    public void addProductIntoCart() {
        loginSteps.logInOneStep();
        cartSteps.clickShopLink();
        cartSteps.selectFromDropDown("date");
        cartSteps.clickAddProductToCart();
        cartSteps.clickCArtButton();
        cartSteps.checkIfItemIsInCart("testItem");

    }

    @Test
    public void removeItemFromCartList() {
        loginSteps.logInOneStep();
        cartSteps.clickShopLink();
        cartSteps.selectFromDropDown("rating");
        cartSteps.addItemsInCart();
        cartSteps.clickCArtButton();
        cartSteps.findItemAndDelete("Single");
        cartSteps.removeItemMesageCheck("“Single” removed. Undo?");
    }
}
