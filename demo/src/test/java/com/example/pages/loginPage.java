package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
    public loginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}

@FindBy(name = "username")
private WebElement username;

@FindBy(name = "password")
private WebElement password;

@FindBy(css = "input[value='Log In']")
private WebElement login;

public void saisirUsername(String user){
    username.sendKeys(user);
}
public void saisirPassword(String pass){
    password.sendKeys(pass);
}
public void clickbtnLogin(){
    login.click();
}
}
