package ru.gb.lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsBagsPage extends BaseView{

    public KidsBagsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[. =\"Школьные рюкзаки для девочек\"]")
    private WebElement girlBags;

    @Step ("Выбор подкатегории товара в категории товара")
    public void searchGirlBags () {
        actions.moveToElement(girlBags)
                .click()
                .perform();
    }
}
