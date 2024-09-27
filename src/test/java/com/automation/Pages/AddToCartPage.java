package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddToCartPage extends BasePage {


    @FindBy(css=".product-title")
    List<WebElement> productList;

    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//p[@class='content']")
    WebElement addMsg;

    @FindBy(id="small-searchterms")
    WebElement searchKey;

    @FindBy(xpath="//button[@type='submit']")
    WebElement searchBtn;

    @FindBy(id= "q")
    WebElement elementPage;

    public void SearchElement(){
        searchKey.sendKeys(ConfigReader.getConfigProperty("element"));
        searchBtn.click();
    }

    public boolean isElementPageDisplayed(){
        return elementPage.isDisplayed();
    }


    public void addToCart(){
        productList.get(0).click();
        addToCartBtn.click();

    }

    public boolean isAddedToCart(){
        return addMsg.isDisplayed();
    }
}
