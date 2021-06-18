package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashboardPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content p:nth-of-type(2)")
    private WebElementFacade newAccountInformation;
    @FindBy(css = ".woocommerce-MyAccount-content > p:nth-of-type(1)")
    private WebElementFacade logInInformation;
    @FindBy(css = ".woocommerce-MyAccount-content > p:nth-of-type(1)")
    private WebElementFacade newAccountHelloInfo;
    @FindBy(css = ".menu-item.menu-item-1728.menu-item-object-page.menu-item-type-post_type > a")
    private WebElementFacade shopLink;
    @FindBy(css = ".fa.fa-search.search-btn")
    private WebElementFacade searchButton;
    @FindBy(css = ".search-block [placeholder]")
    private WebElementFacade searchField;
    @FindBy(css = ".search-block [value=' ']")
    private WebElementFacade searchFieldEnterButton;

    public void verifyNewAccountInformation(String message) {
        newAccountInformation.shouldContainOnlyText(message);
    }

    public void checklogInMessage(String message) {
        logInInformation.shouldContainOnlyText(message);
    }

    public void helloNameText(String message) {
        newAccountHelloInfo.shouldContainOnlyText(message);
    }

    public void clickShoplink() {
        clickOn(shopLink);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void SearchForProduce(String name) {
        typeInto(searchField, name);
    }

    public void clickSearchFieldButton() {
        clickOn(searchFieldEnterButton);
    }
}