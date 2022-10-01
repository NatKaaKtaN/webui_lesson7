package ru.gb.lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SuccessBlock extends BaseView {

    public SuccessBlock(WebDriver driver) {
                super(driver);
    }

     @FindBy(xpath = "//h1[contains(text(), 'Школьные рюкзаки для девочек')] ")
     private WebElement rightSelection;

@Step ("Проверка успешного поиска")
    public void verificationSuccessSelection()  {
       // Assertions.assertNotEmpty(rightSelection.getText(), "Школьные рюкзаки для девочек");
        String expected = "Школьные рюкзаки для девочек";
        assertEquals(expected,rightSelection.getText());

    }

    private void assertEquals(String expected, String rightSelection) {
    }


}
