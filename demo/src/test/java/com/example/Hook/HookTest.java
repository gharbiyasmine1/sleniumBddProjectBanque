package com.example.Hook;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.example.pages.loginPage;
import com.example.pages.registerPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookTest {
    public static WebDriver driver;
    public static loginPage lp;
    public static registerPage rp;
        @Before 
        public void setUp(){
            //driver = new ChromeDriver();
            // lancement avec le Grid 
            ///////////////////////////////////////////////////////////////////
            URL gridUrl=null;
            try {
                 gridUrl = new URL("http://selenium-hub:4444/wd/hub");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            ChromeOptions co = new ChromeOptions();
            driver = new RemoteWebDriver(gridUrl, co);
            ///////////////////////////////////////////////////////////////////////////
            lp = new loginPage(driver);
            rp = new registerPage(driver);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        };
        @After 
        public void tearDown(){
            if(driver!=null){
                driver.quit();
                driver=null;
            }
        }

}
