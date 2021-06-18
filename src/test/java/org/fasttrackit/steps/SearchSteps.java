package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.DashboardPage;
import org.fasttrackit.pages.SearchResultPage;

public class SearchSteps {
    private DashboardPage dashboardPage;
    private SearchResultPage searchResultPage;

    @Step
    public void clickSearchButton() {
        dashboardPage.clickSearchButton();
    }

    @Step
    public void searchForProduct(String name) {
        dashboardPage.SearchForProduce(name);
        dashboardPage.clickSearchFieldButton();
    }

    @Step
    public void checkIfItemWasFound(String itemName) {
        searchResultPage.verifyItemFound(itemName);
    }
}
