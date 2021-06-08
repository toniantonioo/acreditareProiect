package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.DashboardPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAcconutPage;
import org.fasttrackit.pages.MyAcconutResetPasswordPage;
import org.fasttrackit.utils.Constants;

public class LoginSteps {
    private HomePage homePage;
    private MyAcconutPage myAcconutPage;
    private DashboardPage dashboardPage;
    private MyAcconutResetPasswordPage myAcconutResetPasswordPage;
    @Step
    public void enterEmailAndPassword() {
        myAcconutPage.setUsernameField(Constants.USER_EMAIL);
        myAcconutPage.setPasswordFieldLogin(Constants.USER_PASSWORD);
    }

    @Step
    public void clickRememberMeCheckbox() {
        myAcconutPage.clickRememberMecheckbox();
    }

    @Step
    public void clickLogInButton() {
        myAcconutPage.clickLogInButton();
    }

    @Step
    public void logInMessage(String message) {
        dashboardPage.checklogInMessage(message);
    }

    @Step
    public void enterEmailAndPasswordRemotly(String email, String password) {
        myAcconutPage.setUsernameField(email);
        myAcconutPage.setPasswordFieldLogin(password);
    }

    @Step
    public void wrongPasswordError() {
        myAcconutPage.wrongPasswordError("ERROR: The password you entered for the email address fin_toni@yahoo.com" +
                " is incorrect. Lost your password?");
    }
    @Step
    public void clickLostPasswordLink(){
        myAcconutPage.clickLostPasswordLink();
    }

    @Step
    public void entrOnlyEmailForLogin() {
        myAcconutResetPasswordPage.addEmailToResetPass(Constants.USER_EMAIL);
    }
    @Step
    public void clickResetPasswordButton(){
        myAcconutResetPasswordPage.clickResetPasswordButton();
    }
    @Step
    public void checkIfEmailWassSent(String message){
      myAcconutResetPasswordPage.checkResetEmailIfSent(message);
    }
}
