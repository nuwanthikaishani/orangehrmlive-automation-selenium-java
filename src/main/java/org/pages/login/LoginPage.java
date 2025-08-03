package org.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameFeild = By.xpath("//input[@name = 'username']");
    private By userpasswordFeild = By.xpath("//input[@name = 'password']");
    private By loginButton = By.xpath("//button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterUserName(String username){
        driver.findElement(usernameFeild).sendKeys(username);
    }
    public void enterUserPassowrd(String password){
        driver.findElement(userpasswordFeild).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
