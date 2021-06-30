package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    HomePage homePage = new HomePage();


    @FindBy(partialLinkText = "Computers")
    WebElement verifyComputerPageNavigation;

    @FindBy(partialLinkText = "Electronics")
    WebElement verifyElectronicsPageNavigation;

    @FindBy(partialLinkText = "Apparel")
    WebElement verifyApparelPageNavigation;

    @FindBy(partialLinkText = "Digital downloads")
    WebElement verifyDigitalDownloadsPageNavigation;

    @FindBy(partialLinkText = "Books")
    WebElement verifyBooksPageNavigation;

    @FindBy(partialLinkText = "Jewelry")
    WebElement verifyJewelryPageNavigation;

    @FindBy(partialLinkText = "Gift Cards")
    WebElement verifyGiftCardsPageNavigation;


    public void selectMenu(String menu) throws InterruptedException {
        // Thread.sleep(1000);
        if (menu == "Computers") {
            homePage.mousehoveronComputerLink();
        } else if (menu == "Electronics") {
            homePage.clickOnElectronicsLink();
        } else if (menu == "Apparel") {
            homePage.clickOnApparelLink();
        } else if (menu == "Digital downloads") {
            homePage.clickOnDigitalDownloadsLink();
        } else if (menu == "Books") {
            homePage.clickOnBooksLink();
        } else if (menu == "Jewelry") {
            homePage.clickOnJewelryLink();
        } else if (menu == "Gift Cards") {
            homePage.clickOnGiftCardsLink();
        }
    }

    public String verifyComputerPageNavigation() {
        log.info("Verify user navigate to computer page successfully : " + verifyComputerPageNavigation.toString());
        return getTextFromElement(verifyComputerPageNavigation);
    }

    public String verifyElectronicsPageNavigation() {
        log.info("Verify user navigate to electronic page successfully : " + verifyElectronicsPageNavigation.toString());
        return getTextFromElement(verifyElectronicsPageNavigation);
    }

    public String verifyApparelPageNavigation() {
        log.info("Verify user navigate to apparel page successfully : " + verifyApparelPageNavigation.toString());
        return getTextFromElement(verifyApparelPageNavigation);
    }

    public String verifyDigitalDownloadsPageNavigation() {
        log.info("Verify user navigate to digitaldownloads page successfully : " + verifyDigitalDownloadsPageNavigation.toString());
        return getTextFromElement(verifyDigitalDownloadsPageNavigation);
    }

    public String verifyBooksPageNavigation() {
        log.info("Verify user navigate to books page successfully : " + verifyDigitalDownloadsPageNavigation.toString());
        return getTextFromElement(verifyBooksPageNavigation);
    }

    public String verifyJewelryPageNavigation() {
        log.info("Verify user navigate to jewelry page successfully : " + verifyJewelryPageNavigation.toString());
        return getTextFromElement(verifyJewelryPageNavigation);
    }

    public String verifyGiftCardsPageNavigation() {
        log.info("Verify user navigate to giftcards page successfully : " + verifyGiftCardsPageNavigation.toString());
        return getTextFromElement(verifyGiftCardsPageNavigation);
    }


}
