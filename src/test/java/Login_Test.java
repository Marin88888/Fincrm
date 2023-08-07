import org.example.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Login_Test {
    public static WebDriver driver;
    public static String url= "http://localhost/login";
    public static String email="admin@fincrm.de";
    public static String password="12345678";

    @BeforeClass
    public static void  init(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    Login login_page=new Login(driver);
    DashboardPage dashboard=new DashboardPage(driver);
    CustomerPage customer =new CustomerPage(driver);
    MenuPage menuPage=new MenuPage (driver);
    ExportMenuPage exportmenupage=new ExportMenuPage(driver);
    EuropacePage europacePage=new EuropacePage(driver);



    @Test
    public void login(){
        String expected_Login_URL="http://localhost/dashboard";
    login_page.enter_email(email);
    login_page.enter_password(password);
    login_page.click_Register_button();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    String currentURL=driver.getCurrentUrl();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

}

    @Test
    public void createCustomerTest(){

    login();
    dashboard.openMenu();
    dashboard.openCrmList();
    dashboard.goToCustomerPage();
    customer.createNewCustomer();
    customer.sendFirstName("Marin");
    customer.sendLastName("Aranitasi-auto-6");
    customer.sendTelPrivate("+355695290301");
    customer.sendTelWork("+355695290302");
    customer.sendMobile("+355695290303");
    customer.sendEmail("m_aranitasi109@yahoo.com");
    customer.sendEmailWork("m_aranitasi109@yahoo.com");
    customer.clickCreateButton();
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    //test if the user has been created by checking the web page after the creation
    Assert.assertNotSame("http://localhost/customers(modal:customers/create)", login_page.currentUrl());

}
    @Test
    public void exportCustomerTest(){
    login();
    menuPage.menuList();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    menuPage.exportMenu();
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    menuPage.exportToEuropace();
    exportmenupage.slectBaufsmart();
    exportmenupage.customerMenu();
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    exportmenupage.selectCustomer();
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    exportmenupage.PurposeMenu();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    exportmenupage.selectPurpose();
    exportmenupage.exportButton();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    String stringnumber1=exportmenupage.transactionNumber();
    System.out.println(stringnumber1);



    }

    @Test
    public void importCustomerTest(){

        login();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        menuPage.menuList();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        menuPage.importMenu();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        menuPage.importFromEuropace();
    }


    @Test
    public void europace(){
        exportCustomerTest();
        exportmenupage.goToEuropacePage();
        ArrayList<String>eurTab=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(eurTab.get(1));
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        europacePage.loginToEuropace();
    }
}
