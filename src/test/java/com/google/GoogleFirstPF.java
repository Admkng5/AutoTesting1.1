package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class GoogleFirstPF {

    private WebDriver wd;

    @FindBy(how= How.NAME, name = "q")
    WebElement inputField;

    @FindAll(@FindBy(how= How.XPATH, using = "//div[@class='g']//h3"))
    List<WebElement> resultSearch;

    public GoogleFirstPF(WebDriver wd) {
        this.wd = wd;
        wd.get("https://www.google.com/");
    }

    public void googleSearch(String requestStr) {
        inputField.click();
        inputField.sendKeys(requestStr);
        inputField.submit();
    }

    public List<WebElement> getResultSearch() {
        return resultSearch;
    }

}
