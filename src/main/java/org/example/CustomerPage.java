package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPage {


    WebDriver driver;

    public CustomerPage(WebDriver driver){
        this.driver=driver;
    }

    By createNewCustomerButton = By.xpath("/html/body/fc-root/fc-app-main-layout/fc-main-layout/main/ng-component/mat-drawer-container/mat-drawer-content/fc-toolbar/mat-toolbar/button");


    //Locators for creating a new customer

    By salutation =By.linkText("Anrede");
    By male =By.linkText("Herr");
    By female =By.linkText("Frau");
    By title = By.linkText("Titel");
    By firstName=By.cssSelector("input[formcontrolname='first_name']");
    By lastName=By.cssSelector("input[formcontrolname='last_name']");
    By telPrivat=By.cssSelector("input[formcontrolname='phone_private']");
    By telWork =By.cssSelector("input[formcontrolname='phone_office']");
    By mobile =By.cssSelector("input[formcontrolname='mobile']");
    By email =By.cssSelector("input[formcontrolname='email'][type='email']");
    By emailWork =By.cssSelector("input[formcontrolname='email_office']");
    By createButtonn =By.xpath("/html/body/fc-root/fc-customer-create-modal/fc-modal/fc-modal-dialog/div/form/fc-modal-footer/button[2]/span[1]/span");


    //Method to create a new customer
    public void createNewCustomer(){

        driver.findElement(createNewCustomerButton).click();
    }

    public void sendFirstName(String firstname){
        driver.findElement(firstName).sendKeys(firstname);
    }
    public void sendLastName(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void sendTelPrivate(String telprivate){
        driver.findElement(telPrivat).sendKeys(telprivate);
    }

    public void sendTelWork(String telwork){
        driver.findElement(telWork).sendKeys(telwork);
    }

    public void sendMobile(String mobilephone){
        driver.findElement(mobile).sendKeys(mobilephone);
    }

    public void sendEmail(String sendemail){
        driver.findElement(email).sendKeys(sendemail);
    }

    public void sendEmailWork(String emailwork){
        driver.findElement(emailWork).sendKeys(emailwork);
    }

    public void clickCreateButton(){
        driver.findElement(createButtonn).click();
    }



}
