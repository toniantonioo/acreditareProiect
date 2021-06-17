package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fasttrackit.utils.Constants;

import java.util.List;

public class CheckoutPage extends PageObject {

    @FindBy(css = "input#billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy(css = "input#billing_last_name")
    private WebElementFacade lastNameField;
    @FindBy(css = "p#billing_country_field span[role='combobox'] > span[role='presentation']")
    private WebElementFacade CountryDropDownButton;
    @FindBy(css = "ul#select2-billing_country-results > li")
    private List<WebElementFacade> listOfCountries;
    @FindBy(css = ".woocommerce-billing-fields__field-wrapper [placeholder='House number and street name']")
    private WebElementFacade streetAddressField;
    @FindBy(css = "input#billing_postcode")
    private WebElementFacade zipCodeField;
    @FindBy(css = "input#billing_city")
    private WebElementFacade townOrCityField;
    @FindBy(css = "input#billing_phone")
    private WebElementFacade phoneNumberField;
    @FindBy(css = "input#billing_email")
    private WebElementFacade emailField;
    @FindBy(css = "button#place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = ".woocommerce-thankyou-order-received")
    private WebElementFacade checkoutMessage;


    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void clickOnDropDownButton() {
        clickOn(CountryDropDownButton);
    }

    public void pickCountryFromList(String countryName) {

        for (WebElementFacade country : listOfCountries) {
            if (country.getText().equals(countryName)) {
                country.click();
                break;
            }
        }
    }
    public void setStreetAddressField (String streetAddress) {
        typeInto(streetAddressField,streetAddress );
    }

    public void setZipCodeField (String zipCode) {
        typeInto(zipCodeField,zipCode );
    }

    public void setTownOrCityField (String townOrCity) {
        typeInto(townOrCityField,townOrCity );
    }

    public void setPhoneNumberField (String phoneNumber ) {
        typeInto(phoneNumberField,phoneNumber );
    }
    public void setEmailField () {
        typeInto(emailField, Constants.USER_EMAIL);
    }
    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }
    public void checkCheckoutMessage(String message){
        checkoutMessage.shouldContainOnlyText(message);
    }
}