package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {
    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registerTest() {
        registerSteps.navigateToRegisterLogIn();
        registerSteps.enterEmailAndPass("passwordparolA123");
        registerSteps.clickRegisterButton();
        registerSteps.checkNewAcconutInfo();
    }

public void createAccountFromAdmin(){


}

}
