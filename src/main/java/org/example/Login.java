package org.example;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login {

WebDriver driver;

public Login(WebDriver driver){
    this.driver=driver;
}

    //locator for the email field
    By email = By.id("mat-input-0");
    //locator for password field
    By login_psw = By.id("mat-input-1");
    By register_btn = By.xpath("/html/body/fc-root/fc-login/section/mat-card/form/div/fc-spinner-button/button/span[1]/div");
    //locator for the password visibility button
    By show_password= By.xpath("/html/body/fc-root/fc-login/section/mat-card/form/mat-form-field[2]/div/div[1]/div[2]/button/span[1]/mat-icon");
    By support_btn = By.xpath("/html/body/fc-root/fc-login/section/div[2]/a/span[1]");
    //locator for the warning message of the email
    By email_warning_message = By.id("mat-error-9");
    By password_warning_message= By.id("mat-error-10");




    public String currentUrl(){

        String currentUrl=driver.getCurrentUrl();
        return currentUrl;
    }
    //Method to enter the email of the user
    public void enter_email(String email_user){
        driver.findElement(email).sendKeys(email_user);
    }
    //Method to enter the password of the use
    public void enter_password(String password){
        driver.findElement(login_psw).sendKeys(password);
    }
    //Method to click the Register button
    public void click_Register_button (){

        driver.findElement(register_btn).click();
            }

    //method that checks the email warning message is displayed when the email is empty
    public boolean email_warning (){

        Boolean email_warning =driver.findElement(email_warning_message).isDisplayed();
        return email_warning;

    }
    //method that checks the password warning message is displayed when the email is empty
    public boolean password_warning(){

        Boolean insert_password =driver.findElement(password_warning_message).isDisplayed();
        return (insert_password);
    }

}
