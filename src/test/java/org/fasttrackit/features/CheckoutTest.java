package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void itemThroughCheckoutProcess() {

        loginSteps.logInOneStep();
        cartSteps.clickShopLink();
        cartSteps.selectFromDropDown("date");
        cartSteps.clickAddProductToCart();
        cartSteps.clickCArtButton();
        checkoutSteps.proceedToCheckout();
        checkoutSteps.completeBillingDetailsFields("Antoino", "Chiciudean", "Romania",
                "Grigorescu", "405300", "ClujNapoca", "0745364728");
        checkoutSteps.clickPlaceOrderButton();
       checkoutSteps.checkCheckoutMessage("Thank you. Your order has been received.");
    }
}
