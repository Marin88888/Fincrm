package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExportMenuPage {

    WebDriver driver;

    public ExportMenuPage(WebDriver driver){
        this.driver=driver;
    }

    By selectbaufsmart =By.xpath("//mat-radio-button[@ng-reflect-value='baufismart']");
    By selectkreditsmart = By.xpath("//mat-radio-button[@ng-reflect-value='kreditsmart']");
    By selectcustomermenu = By.xpath("//mat-select[@ng-reflect-placeholder='Kunde']");
    By customer=By.xpath("//*[@id=\"mat-option-93\"]");

    By purposemenu = By.xpath("//mat-select[@ng-reflect-placeholder='Vorhaben']");
    By purpose =By.xpath("//mat-option[contains(@ng-reflect-value,'3857')]");

    //locator for the Export button on the table
    By exportbtn=By.xpath("//button[contains(@type,'submit')]");

    By transactionNumber =By.xpath("//*[@id=\"mat-dialog-0\"]/ng-component/form/div[1]/table/tbody/tr/td[2]");

    By goToEuropacePage = By.linkText("Vorgang ansehen");


    //Method to select Baufsmart
    public void slectBaufsmart (){

        driver.findElement(selectbaufsmart).click();
    }

    //Method to click the Customer Menu
    public void customerMenu(){

        driver.findElement(selectcustomermenu).click();
    }

    //Method to select one of the customers on the list
    public void selectCustomer(){

        driver.findElement(customer).click();
    }

    //Method to click the Purpose Menu
    public void PurposeMenu(){

        driver.findElement(purposemenu).click();
    }

    //Method to select the purpose from the list
    public void selectPurpose(){
        driver.findElement(purpose).click();
    }

    //Method to click the Export button on the table
    public void exportButton(){
        driver.findElement(exportbtn).click();

    }

    //Method to get the transaction number of hte customer export
    public String transactionNumber(){
       String transnumber=driver.findElement(transactionNumber).getText().toString();
       return transnumber;
    }

    //Method to go to the Europace page after the export of a customer
    public void goToEuropacePage(){

        driver.findElement(goToEuropacePage).click();

    }

}
