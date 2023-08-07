package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Main {

    public static ChromeDriver driver;
     static String email_address="admin@fincrm.de";
    static String password= "12345678";
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("http://localhost/login");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement email = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
        email.sendKeys(email_address);
        WebElement psw = driver.findElement(By.id("mat-input-1"));
        psw.sendKeys(password);

        WebElement login = driver.findElement(By.xpath("/html/body/fc-root/fc-login/section/mat-card/form/div/fc-spinner-button/button/span[1]/div"));
        login.click();





    }
}