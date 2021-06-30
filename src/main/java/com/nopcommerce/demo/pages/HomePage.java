package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;

    @FindBy(linkText = "Apparel")
    WebElement apparelLink;
    By d = By.linkText("");
    @FindBy(linkText = "Digital downloads")
    WebElement digitaldownloadsLink;

    @FindBy(linkText = "Books")
    WebElement booksLink;

    @FindBy(linkText = "Jewelry")
    WebElement jewelryLink;

    @FindBy(linkText = "Gift Cards")
    WebElement giftcardLink;

    public void mousehoveronComputerLink() {
        //clickOnElement(computersLink);
        mouseHoverToElement(computersLink);
        log.info("Clicking on computer lin : " + computersLink.toString());

    }

    public void clickOnElectronicsLink() {
        clickOnElement(electronicsLink);
        log.info("Clicking on electronics link : " + electronicsLink.toString());

    }

    public void clickOnApparelLink() {
        clickOnElement(apparelLink);
        log.info("Clicking on apparel link : " + apparelLink.toString());

    }

    public void clickOnDigitalDownloadsLink() {
        clickOnElement(digitaldownloadsLink);
        log.info("Clicking on digital downloads link : " + digitaldownloadsLink.toString());
    }

    public void clickOnBooksLink() {
        clickOnElement(booksLink);
        log.info("Clicking books link : " + booksLink.toString());

    }

    public void clickOnJewelryLink() {
        clickOnElement(jewelryLink);
        log.info("Clicking on jewelry link : " + jewelryLink.toString());

    }

    public void clickOnGiftCardsLink() {
        clickOnElement(giftcardLink);
        log.info("Clicking on giftcards link : " + giftcardLink.toString());


    }


}