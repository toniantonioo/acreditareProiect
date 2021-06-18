package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends PageObject {
    @FindBy(css = ".entry-title")
    private WebElementFacade resultFromSearch;



    public void verifyItemFound(String itemName){
        resultFromSearch.shouldContainOnlyText(itemName);
    }


}
