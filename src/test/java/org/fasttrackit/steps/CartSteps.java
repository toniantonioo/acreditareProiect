package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.DashboardPage;
import org.fasttrackit.pages.MeniuShopPage;

public class CartSteps {

    private MeniuShopPage meniuShopPage;
    private DashboardPage dashboardPage;
    private CartPage cartPage;

    @Step
    public void clickShopLink() {
        dashboardPage.clickShoplink();
    }

    @Step

    public void selectFromDropDown(String sortBy) {
        meniuShopPage.setSortByDropdown(sortBy);
    }

    @Step
    public void clickAddProductToCart() {
        meniuShopPage.clickAddToCartProduct();
    }

    @Step
    public void clickCArtButton() {
        meniuShopPage.clickCartButton();
    }

    @Step
    public void checkIfItemIsInCart(String itemName) {
        cartPage.checkIfItemIsInCart(itemName);
    }

    @Step
    public void empyCart() {
        cartPage.emptyCartList();

    }

    @Step
    public void addItemsInCart() {
        meniuShopPage.clickSingleProduct();
        meniuShopPage.clickHoodieWithLegoProduct();
        meniuShopPage.clickTShirtProduct();

    }

    @Step
    public void findItemAndDelete(String name) {
        cartPage.findItemInListAndDelete(name);
    }

    @Step
    public void removeItemMesageCheck(String text) {
        cartPage.removeMessageCheck(text);
    }

    @Step
    public void removeItemFromCart() {
        cartPage.removeItemFromCart();
    }

    @Step
    public void checkCartEmpty() {
        cartPage.emptyCartMessage();
    }
}
