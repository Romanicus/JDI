package com.epam.jdi.cucumber.stepdefs.en;

import com.epam.jdi.uitests.core.interfaces.base.IClickable;
import cucumber.api.java.en.When;

import static com.epam.jdi.cucumber.Utils.getElementByName;

/**
 * Created by Dmitry_Lebedev1 on 1/15/2016.
 */
public class ButtonFrameworkStepdefs {

    @When("^I click on \"([^\"]*)\"(?:(?: button|link)$|$)")
    public void iMClickOnButton(String buttonName) {
        IClickable cl = getElementByName(buttonName);
        cl.click();
    }

    @When("^I click on \"([^\"]*)\" (?:(?: button|link)) from \"([^\"]*)\"$")
    public void iMClickOnLinkFrom(String fieldName, String containerName) {
        IClickable cl = getElementByName(containerName, fieldName);
        cl.click();
    }
}
