package ru.gb.lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class MainPage extends BaseView {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Поиск товаров']")
   private WebElement productSearchWindow;

    @Step ("Ввод слова в строку поиска")
    public void inputSearch() {
        productSearchWindow.sendKeys("рюкзак");
    }

    @FindBy(xpath = "a[href = \"/kids_bags/\"]")
    private WebElement kidsBags;

    @Step ("Выбор категории товара из списка")
    public void searchList() {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated((By) kidsBags));
        actions.moveToElement(kidsBags)
                .click()
                .perform();

    }
}



