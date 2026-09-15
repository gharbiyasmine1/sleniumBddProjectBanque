package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
    WebDriver driver;
    public registerPage(WebDriver driver) {
    this.driver = driver;
 PageFactory.initElements(driver, this);

}
    

@FindBy(linkText = "Register")
private WebElement registerLink;

@FindBy (id="customer.firstName") 
private WebElement firstName;

@FindBy (id="customer.lastName")
private WebElement lastname;

@FindBy (id="customer.address.street")
private WebElement adress;

@FindBy (id ="customer.address.city")
private WebElement city;

@FindBy (id="customer.address.state")
private WebElement state;

@FindBy(id="customer.address.zipCode")
private WebElement zipCode;

@FindBy (id="customer.phoneNumber")
private WebElement phone;

@FindBy( id ="customer.ssn")
private  WebElement ssn;

@FindBy( id ="customer.username")
private WebElement username;

@FindBy (id="customer.password")
private WebElement password;

@FindBy (id="repeatedPassword")
private WebElement confirm;

@FindBy(css = ".button[value='Register']")
private WebElement register;


public void clickregisterLink(){
    registerLink.click();
}
public void saisirFirstname(String f){
    firstName.sendKeys(f);
}
public void sasirLastname(String l){
    lastname.sendKeys(l);
}
public void saisirAddress(String d){
    adress.sendKeys(d);
}
public void saisirCity(String c){
    city.sendKeys(c);
}
public void saisirState(String s ){
    state.sendKeys(s);
}
public void saisirZipCode(String z){
    zipCode.sendKeys(z);
}
public void saisirPhone(String p){
    phone.sendKeys(p);
}
public void saisirSsn(String ss){
    ssn.sendKeys(ss);
}
public void sasirUsername(String u){
    username.sendKeys(u);
}
public void saisirPassword(String pass){
    password.sendKeys(pass);
}
public void saisirConfirm(String con){
    confirm.sendKeys(con);
}
public void clickBtnRegister(){
    register.click();
}

}
