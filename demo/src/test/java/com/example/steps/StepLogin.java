package com.example.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import com.example.Hook.HookTest;
import com.example.pages.loginPage;
import com.example.pages.registerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepLogin {

    WebDriver driver;
    loginPage lp;
    
    
     @Given("acceder a lUrl  {string}")
    public void acceder_a_lUrl(String url) {
        driver = HookTest.driver;
        lp = new loginPage(driver);
        driver.get(url);    
    }

    @When("entrer le username {string}")
    public void entrer_le_username(String s) {
        lp.saisirUsername(s);
    }

     @When("entrer le password {string}")
    public void entrer_le_password(String s) {
        lp.saisirPassword(s);
    }

    @When("click sur le boutton login")
    public void click_sur_le_boutton_login() {
        lp.clickbtnLogin();
    }

    @Then("diriger a lespace client {string}")
    public void diriger_a_lespace_client(String s) {
        assertEquals(s,driver.getCurrentUrl());
    }

}
