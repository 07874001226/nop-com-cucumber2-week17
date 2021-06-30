package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.BuildYourOwnComputerProductPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildYourOwnStepdefs {


    @Given("^I am on computer page$")
    public void iAmOnComputerPage() {
        new HomePage().mousehoveronComputerLink();
    }

    @And("^I click on desktopLink$")
    public void iClickOnDesktopLink() {
        new DesktopPage().setClickOnDesktopLink();
    }

    @And("^I sort product by Z to A$")
    public void iSortProductByZToA() throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().setSelectOnZtoA("6");
    }

    @Then("^I should arrange product in Z to A order$")
    public void iShouldArrangeProductInZToAOrder() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> desktop;
        desktop = new DesktopPage().setVerifyProductDescending();
        List<String> desktopList = new ArrayList<>();
        for (WebElement productname : desktop) {

            desktopList.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(desktopList);
        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(desktopList);
        System.out.println(tempList);
        Assert.assertEquals(desktopList, tempList);


    }

    @And("^I sort product by A to Z$")
    public void iSortProductByAToZ() {
        new DesktopPage().setGetSelectOnAtoZ("5");
    }

    @And("^I click on add to cart tab$")
    public void iClickOnAddToCartTab() throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().setAddToCartfeature();

    }

    @Then("^I should navigate to build your own computer page$")
    public void iShouldNavigateToBuildYourOwnComputerPage() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Build your own computer", new BuildYourOwnComputerProductPage().verifyBuildYourOwnComputer());
    }

    @And("^I select the processor<\"([^\"]*)\">$")
    public void iSelectTheProcessor(String processor) throws InterruptedException {
        Thread.sleep(1000);
new BuildYourOwnComputerProductPage().selectTheProcesser("1");
    }

    @And("^I select the ram <\"([^\"]*)\">$")
    public void iSelectTheRam(String ram) throws InterruptedException {
        Thread.sleep(1000);
new BuildYourOwnComputerProductPage().setSelectRam("5");
    }

    @And("^I Click on hdd$")
    public void iClickOnHdd() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerProductPage().clickOnHdd();
    }

    @And("^I click on Os radio$")
    public void iClickOnOsRadio() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerProductPage().clickOnOsRadio();
    }

    @And("^I click on microsoftOffice$")
    public void iClickOnMicrosoftOffice() throws InterruptedException {
        new BuildYourOwnComputerProductPage().clickOnMicrosoftOffice();
        Thread.sleep(1000);
        new BuildYourOwnComputerProductPage().clickOnMicrosoftOffice();
    }

    @And("^I click on totalcommender$")
    public void iClickOnTotalcommender() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerProductPage().clickOnTotalCommender();
    }

    @Then("^I verify total ammount$")
    public void iVerifyTotalAmmount() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("$1,475.00", new BuildYourOwnComputerProductPage().verifyThePrice());
    }

    @When("^I click on add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        new BuildYourOwnComputerProductPage().clickOnAddtoCartButton();
    }

    @Then("^I should see the message the product added successfully$")
    public void iShouldSeeTheMessageTheProductAddedSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("The product has been added to your shopping cart", new BuildYourOwnComputerProductPage().verifyTopGreenBarMessage());
    }

    @And("^I click on green pop up button$")
    public void iClickOnGreenPopUpButton() {

        new BuildYourOwnComputerProductPage().setCloseTab();


    }
}