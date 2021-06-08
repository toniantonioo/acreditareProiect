package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.pages.DashboardPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAcconutPage;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    private HomePage homePage;
    private MyAcconutPage myAcconutPage;
    private DashboardPage dashboardPage;

    @Step
    public void navigateToRegisterLogIn() {
        homePage.open();
        homePage.clickSingInRegisterLink();

    }

    String random = (RandomStringUtils.randomAlphabetic(15));

    @Step
    public void enterEmailAndPass(String password) {
        myAcconutPage.setEmailField(random + "@gmail.com");
        myAcconutPage.setPasswordField(password);
    }

    @Step
    public void clickRegisterButton() {
        myAcconutPage.clickRegisterButton();
    }

    @Step
    public void checkNewAcconutInfo() {
        dashboardPage.helloNameText(("Hello ") + random+" (not "+ random+"? Log out)");
    }
}
