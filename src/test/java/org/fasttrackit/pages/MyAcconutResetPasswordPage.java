package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAcconutResetPasswordPage extends PageObject {

    @FindBy(id = "user_login")
    private WebElementFacade userEmailField;
    @FindBy(css = ".woocommerce-Button")
    private WebElementFacade resetPaswordButton;
    @FindBy(css = "[role='alert']")
    private WebElementFacade resetPasswordEmailSent;

    public void addEmailToResetPass(String email) {
        typeInto(userEmailField, email);
    }

    public void clickResetPasswordButton() {
        clickOn(resetPaswordButton);
    }

    public void checkResetEmailIfSent(String message) {
        resetPasswordEmailSent.shouldContainOnlyText(message);
    }
}
