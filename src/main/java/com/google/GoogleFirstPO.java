package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GoogleFirstPO extends BaseTest{

    private WebDriver wd;

    WebElement inputField;
    List<WebElement> resultSearch;

    public GoogleFirstPO(WebDriver wd) {
        this.wd = wd;
        inputField = wd.findElement(By.xpath("//*[@name='q']"));
        List<WebElement> resultSearch = wd.findElements(By.xpath("//div[@class='g']//h3"));
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
