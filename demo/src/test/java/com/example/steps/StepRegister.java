package com.example.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import com.example.Hook.HookTest;
import com.example.pages.loginPage;
import com.example.pages.registerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepRegister {

    WebDriver driver ;
        registerPage rp ;

        String username = "user"+(int)(Math.random()*1000);
        String password = "Pass1234!"+(int)(Math.random()*1000);
        String adress = "adress"+(int)(Math.random()*1000);
        String city = "city"+(int)(Math.random()*1000);
        String state = "state"+(int)(Math.random()*1000);
        String zipCode = "zipCode"+(int)(Math.random()*1000);
        String phone = "0707070707";
        String ssn = "0707070707";
        String firstname = "firstname"+(int)(Math.random()*1000);
       String lastname = "lastname"+(int)(Math.random()*1000);
    
     @Given("acceder la page dacceuil {string}")
    public void acceder_la_page_dacceuil(String url) {
        driver = HookTest.driver;
        rp = new registerPage(driver);
        driver.get(url);    
    }

    @When("saisir le firstname {string}")
    public void saisir_le_firstname(String s) {
        rp.saisirFirstname(this.firstname);
    }

    @When("saisir le lastname {string}")
    public void saisir_le_lastname(String s) {
        rp.sasirLastname(this.lastname);
    }

    @When("saisir le address {string}")
    public void saisir_le_address(String s) {
    rp.saisirAddress(this.adress);    
    }

    @When("saisir le state {string}")
    public void saisir_le_state(String s) {
        rp.saisirState(this.state);
    }

    @When("saisir le zipCode {string}")
    public void saisir_le_zipCode(String s) {
        rp.saisirZipCode(this.zipCode);
    }

    @When("saisir le phone {string}")
    public void saisir_le_phone(String s) {
        rp.saisirPhone(this.phone);
    }

    @When("saisir le ssn {string}")
    public void saisir_le_ssn(String s) {
        rp.saisirSsn(this.ssn);
    }

    @When("saisir la city {string}")
    public void saisir_la_city(String s) {
        rp.saisirCity(this.city);
    }

    @When("saisir le password {string}")
    public void saisir_le_password(String s) {
        rp.saisirPassword(this.password);
    }

    @When("saisir le username {string}")
    public void saisir_le_username(String s) {
        rp.sasirUsername(this.username);
    }

    @When("saisir le confirm {string}")
    public void saisir_le_confirm(String s) {
        rp.saisirConfirm(this.password);
    }
    

    @Then("acceder a la page dacceuil {string}")
    public void acceder_a_la_page_dacceuil(String s) {
        assertEquals(s, driver.getCurrentUrl());
    }

    @When("click sur le boutton register")
    public void click_sur_le_boutton_register() {
        rp.clickBtnRegister();
    }

    @When("je click sur lUrl register")
    public void je_click_sur_lUrl_register() {
        rp.clickregisterLink();
    }
    
}
