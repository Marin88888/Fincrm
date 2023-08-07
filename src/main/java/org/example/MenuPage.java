package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {


    WebDriver driver;

    public MenuPage(WebDriver driver){
        this.driver=driver;
    }

    By menu =By.xpath ("/html/body/fc-root/fc-app-main-layout/fc-main-layout/fc-header/header/mat-toolbar/mat-toolbar-row[2]/fc-user-menu/button");
    //locator for the export button (using nested elements to locate and using ancestor to be sure that the button is going to be clicked and not the icon)
    By export=By.xpath("//button[contains(@class, 'mat-menu-item')and contains (text(),'Exportieren')]");

    //Locator for the export to Europace button
    By exportEuropace =By.cssSelector ("button.mat-menu-item[fcexportprojecteuropace]");

    //Locator for the import button
    By imports=By.xpath ("//button[contains(text(),'Importieren')]");

    //locator for the import from Europace
    By importEuropace = By.cssSelector("button.mat-menu-item[fcimportprojecteuropace]");




    //Method to open the menu list
    public void menuList(){

        driver.findElement (menu).click ();
    }

    //Method to click the export menu
    public void exportMenu(){

    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(export)).click().perform();


    }

    //Method to export to europace
    public void exportToEuropace(){

        driver.findElement(exportEuropace).click();
    }



    //Method to click the import menu
    public void importMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(imports)).click().perform();

    }

    //Method to import from europace
    public void importFromEuropace(){

        driver.findElement(importEuropace).click();
    }

}
