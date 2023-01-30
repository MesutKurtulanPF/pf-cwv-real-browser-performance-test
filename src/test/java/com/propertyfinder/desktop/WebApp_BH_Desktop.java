package com.propertyfinder.desktop;

import com.propertyfinder.ReadTxtFiles.ReadTxtFile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebApp_BH_Desktop {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void cwvTestBahrainDesktop() {

        List<String> urls = ReadTxtFile.txtReaderBH();

        for(int i=0; i<urls.size(); i++)
        {
            driver.get(urls.get(i));

            List<WebElement> savedSearchButton = driver.findElements(By.cssSelector("[data-testid='save-search-button'], [data-qs='SaveSearchCtaComponent'] > button"));

            if (savedSearchButton.size() != 0) {
                savedSearchButton.get(0).click();
            }

        }
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
