package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomeStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on computer$")
    public void iClickOnComputer() {
        new HomePage().mousehoveronComputerLink();
    }

    @Then("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
        Assert.assertEquals("Computers",new TopMenuPage().verifyComputerPageNavigation());

    }

    @When("^I click on electronics$")
    public void iClickOnElectronics() {
        new HomePage().clickOnElectronicsLink();
    }

    @Then("^I should navigate to electronics page successfully$")
    public void iShouldNavigateToElectronicsPageSuccessfully() {
        Assert.assertEquals("Electronics",new TopMenuPage().verifyElectronicsPageNavigation());

    }


    @When("^I click on apparel$")
    public void iClickOnApparel() {
        new HomePage().clickOnApparelLink();
    }

    @Then("^I should navigate to apparel page successfully$")
    public void iShouldNavigateToApparelPageSuccessfully() {
        Assert.assertEquals("Apparel",new TopMenuPage().verifyApparelPageNavigation());

    }

    @When("^I click on digital downloads$")
    public void iClickOnDigitalDownloads() {
        new HomePage().clickOnDigitalDownloadsLink();
    }

    @Then("^I should navigate to digital downloads page successfully$")
    public void iShouldNavigateToDigitalDownloadsPageSuccessfully() {
        Assert.assertEquals("Digital downloads",new TopMenuPage().verifyDigitalDownloadsPageNavigation());

    }

    @When("^I click on books$")
    public void iClickOnBooks() {
        new HomePage().clickOnBooksLink();
    }


    @Then("^I should navigate to books page successfully$")
    public void iShouldNavigateToBooksPageSuccessfully() {
        Assert.assertEquals("Books",new TopMenuPage().verifyBooksPageNavigation());

    }

    @When("^I click on jewelry$")
    public void iClickOnJewelry() {
        new HomePage().clickOnJewelryLink();
    }

    @Then("^I should navigate to jewelry page successfully$")
    public void iShouldNavigateToJewelryPageSuccessfully() {
        Assert.assertEquals("Jewelry",new TopMenuPage().verifyJewelryPageNavigation());

    }

    @When("^I click on giftcards$")
    public void iClickOnGiftcards() {
        new HomePage().clickOnGiftCardsLink();
    }

    @Then("^I should navigate to giftcards page successfully$")
    public void iShouldNavigateToGiftcardsPageSuccessfully() {
        Assert.assertEquals("Gift Cards",new TopMenuPage().verifyGiftCardsPageNavigation());

    }
}
