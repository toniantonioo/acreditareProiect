package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.MyAcconutResetPasswordPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Steps
    private RegisterSteps registerSteps;
    @Steps
    private LoginSteps loginSteps;
    @Test
    public void logInTest() {
        registerSteps.navigateToRegisterLogIn();
        loginSteps.enterEmailAndPassword();
        loginSteps.clickRememberMeCheckbox();
        loginSteps.clickLogInButton();
        loginSteps.logInMessage("Hello fin_toni (not fin_toni? Log out)");
    }

    @Test
    public void enterWrongPassword() {
        registerSteps.navigateToRegisterLogIn();
        loginSteps.enterEmailAndPasswordRemotly("fin_toni@yahoo.com", "asdfsd122asdf");
        loginSteps.clickLogInButton();
        loginSteps.wrongPasswordError();
    }
    @Test
    public void lostYourPasswordTest(){
        registerSteps.navigateToRegisterLogIn();
        loginSteps.clickLostPasswordLink();
        loginSteps.entrOnlyEmailForLogin();
        loginSteps.clickResetPasswordButton();
        loginSteps.checkIfEmailWassSent("Password reset email has been sent.");
    }

}
