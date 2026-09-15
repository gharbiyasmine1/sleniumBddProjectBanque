package com.example.Hook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
            driver = new ChromeDriver();
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
