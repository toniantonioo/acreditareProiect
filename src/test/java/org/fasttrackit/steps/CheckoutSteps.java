package org.fasttrackit.steps;

import lombok.SneakyThrows;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;

public class CheckoutSteps {
private CartPage cartPage;
private CheckoutPage checkoutPage;

@Step
public void proceedToCheckout(){
    cartPage.clickCheckoutButton();
}
@Step
@SneakyThrows
public void completeBillingDetailsFields(String firstName, String lastName, String country, String streetAddress,
                                         String zipCode, String townOrCity, String phoneNumber){
    checkoutPage.setFirstNameField(firstName);
    checkoutPage.setLastNameField(lastName);
    checkoutPage.clickOnDropDownButton();
    checkoutPage.pickCountryFromList(country);
    checkoutPage.setStreetAddressField(streetAddress);
    checkoutPage.setZipCodeField(zipCode);
    checkoutPage.setTownOrCityField(townOrCity);
    checkoutPage.setPhoneNumberField(phoneNumber);
    checkoutPage.setEmailField();
    Thread.sleep(2000);
}
@SneakyThrows
@Step
    public void clickPlaceOrderButton()  {
    checkoutPage.clickPlaceOrderButton();
    Thread.sleep(2000);
}

@Step
    public void checkCheckoutMessage(String message){
    checkoutPage.checkCheckoutMessage(message);
}

}
