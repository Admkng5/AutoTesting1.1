package com.google;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class Tests extends BaseTest {

    @Test
    public void testPageFactory() {
        GoogleFirstPF googleFirstPF = PageFactory.initElements(wd, GoogleFirstPF.class);
        googleFirstPF.googleSearch("Гладиолус");
        Assertions.assertTrue(googleFirstPF.getResultSearch().stream().anyMatch(x->x.getText()
                .contains("Википедия")),"Википедия не найдена");
        }

    @Test
    public  void testPageObject() {
        wd.get("https://www.google.com/");
        GoogleFirstPO googleFirstPO = new GoogleFirstPO(wd);
        googleFirstPO.googleSearch("Гладиолус");
        Assertions.assertTrue(googleFirstPO.getResultSearch().stream().anyMatch(x->x.getText()
                .contains("Википедия")),"Википедия не найдена");
    }

}
