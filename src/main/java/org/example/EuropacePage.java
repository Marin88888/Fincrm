package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EuropacePage {

    WebDriver driver;

    public EuropacePage(WebDriver driver){
        this.driver=driver;
    }

    By username =By.id("inputEmail");
    By submit =By.id("submit-username");
    By password= By.id("password");
    By login=By.id("kc-login");



    //Method to login to europace page
    public void loginToEuropace(){

        driver.findElement(username).sendKeys("marin.aranitasi@fincrm.de");
        driver.findElement(submit).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(password).sendKeys("Erjonadragoi89.");
        driver.findElement(login).click();

    }



}
