package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class MyAcconutPage extends PageObject {


    @FindBy(id = "reg_email")
    private WebElementFacade emailField;
    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;
    @FindBy(css = "button[name='register']")
    private WebElementFacade registerButton;
    @FindBy(id = "username")
    private WebElementFacade usernameField;
    @FindBy(css = "input#password")
    private WebElementFacade passwordFieldLogin;
    @FindBy(id = "rememberme")
    private WebElementFacade RememberMeCheckbox;
    @FindBy(css = "button[name='login")
    private WebElementFacade logInButton;
    @FindBy(css = ".hentry.page.post-13.status-publish.type-page li")
    private WebElementFacade errorPasswordIsIncorect;
    @FindBy(css = "[method='post']  a")
    private WebElementFacade lostYourPasswordLink;

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public void setUsernameField(String usernameEmail) {
        typeInto(usernameField, usernameEmail);
    }

    public void setPasswordFieldLogin(String password) {
        typeInto(passwordFieldLogin, password);
    }

    public void clickRememberMecheckbox() {
        clickOn(RememberMeCheckbox);
    }

    public void clickLogInButton() {
        clickOn(logInButton);
    }

    public void wrongPasswordError(String message) {
        errorPasswordIsIncorect.shouldContainOnlyText(message);
    }

    public void clickLostPasswordLink() {
        clickOn(lostYourPasswordLink);
    }
}


