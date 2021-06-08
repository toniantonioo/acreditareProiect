package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.yecht.Data;

public class DashboardPage extends PageObject {

@FindBy(css = ".woocommerce-MyAccount-content p:nth-of-type(2)")
private WebElementFacade newAccountInformation;
 public void verifyNewAccountInformation(String message){
     newAccountInformation.shouldContainOnlyText(message);
 }

 @FindBy(css = ".woocommerce-MyAccount-content > p:nth-of-type(1)")
 private WebElementFacade logInInformation;
    public void checklogInMessage(String message){
      logInInformation.shouldContainOnlyText(message);

}

@FindBy(css = ".woocommerce-MyAccount-content > p:nth-of-type(1)")
    private WebElementFacade newAccountHelloInfo;
    public void helloNameText(String message){
        newAccountHelloInfo.shouldContainOnlyText(message);
    }
}