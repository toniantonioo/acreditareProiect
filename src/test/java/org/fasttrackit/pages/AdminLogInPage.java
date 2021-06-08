package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Feature;


@DefaultUrl("http://qa3.fasttrackit.org:8008/wp-login.php?redirect_to=http%3A%2F%2Fqa3.fasttrackit." +
        "org%3A8008%2Fwp-admin%2Fusers.php&reauth=1")

public class AdminLogInPage extends PageObject {
    @FindBy(id = "user_login")
    private WebElementFacade adminUsernameLogInField;
    @FindBy(id = "user_pass")
    private WebElementFacade adminPasswordLoginField;
    @FindBy(css = "#wp-submit")
    private WebElementFacade adminLoginButton;
}
