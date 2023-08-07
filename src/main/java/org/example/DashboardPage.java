package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xml.sax.Locator;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver=driver;
    }

    By menu= By.xpath("/html/body/fc-root/fc-app-main-layout/fc-main-layout/fc-header/header/mat-toolbar/mat-toolbar-row[1]/button/span[1]/mat-icon");
    //Locator for the CRM
    By crm =By.xpath("/html/body/fc-root/fc-app-main-layout/fc-main-layout/fc-sidebar/mat-nav-list/a[2]/span/mat-icon");
        By customer=By.linkText("Kunden");
        By purpose=By.linkText("Vorhaben");



        //Method that opens the right menu
    public void openMenu(){

        driver.findElement(menu).click();
    }

        // Method to open the CRM list

    public void openCrmList(){

        driver.findElement(crm).click();
    }

        //Method to navigate to Customer page
        public void goToCustomerPage(){

            driver.findElement(customer).click();
        }

        //Method to go to the Purpose list

        public void goToPurposeList (){

            driver.findElement(purpose).click();
        }



}






