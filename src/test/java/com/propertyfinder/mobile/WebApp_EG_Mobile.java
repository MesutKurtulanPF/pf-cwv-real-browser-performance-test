package com.propertyfinder.mobile;

import com.propertyfinder.ReadTxtFiles.ReadTxtFile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebApp_EG_Mobile {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void setUp(){

        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone X");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        driver = new ChromeDriver(chromeOptions);

    }

    @Test
    public void cwvTestEgyptMobile() {

        List<String> urls = ReadTxtFile.txtReaderEG();

        for(int i=0; i<urls.size(); i++)
        {
            driver.get(urls.get(i));
            WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
            WebElement filter = driver.findElement(By.cssSelector("[data-testid='filters-button']"));
            wait.until(ExpectedConditions.elementToBeClickable(filter));
            filter.click();
        }

    }

    @After
    public void teardown(){
        driver.quit();
    }
}
