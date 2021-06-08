package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class MyAcconutPage extends PageObject {


    @FindBy(id = "reg_email")
    private WebElementFacade emailField;
    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;
    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    @FindBy(css = "button[name='register']")
    private WebElementFacade registerButton;
    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    @FindBy(id = "username")
    private WebElementFacade usernameField;
    public void setUsernameField(String usernameEmail) {
        typeInto(usernameField, usernameEmail);
    }

    @FindBy(css = "input#password")
    private WebElementFacade passwordFieldLogin;
    public void setPasswordFieldLogin(String password) {
        typeInto(passwordFieldLogin, password);
    }

    @FindBy(id = "rememberme")
    private WebElementFacade RememberMeCheckbox;
    public void clickRememberMecheckbox() {
        clickOn(RememberMeCheckbox);
    }

    @FindBy(css = "button[name='login")
    private WebElementFacade logInButton;
    public void clickLogInButton() {
        clickOn(logInButton);
    }

    @FindBy(css = ".hentry.page.post-13.status-publish.type-page li")
    private WebElementFacade errorPasswordIsIncorect;
    public void wrongPasswordError(String message) {
        errorPasswordIsIncorect.shouldContainOnlyText(message);
    }

    @FindBy(css ="[method='post']  a")
    private WebElementFacade lostYourPasswordLink;
    public void clickLostPasswordLink(){
        clickOn(lostYourPasswordLink);
    }
}


