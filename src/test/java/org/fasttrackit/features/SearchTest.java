package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;

@Test
    public void searchProductByName() {
        loginSteps.logInOneStep();
        searchSteps.clickSearchButton();
        searchSteps.searchForProduct("testItem");
        searchSteps.checkIfItemWasFound("testItem");

    }


}
