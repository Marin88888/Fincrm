import org.example.CustomerPage;
import org.example.DashboardPage;
import org.example.Login;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CustomerTest {
    public static ChromeDriver driver;

    Login login_page=new Login(driver);
    Login_Test loginTest=new Login_Test();
    DashboardPage dashboard=new DashboardPage(driver);
    CustomerPage customer=new CustomerPage(driver);
    public static String url= "http://localhost/login";
    @BeforeClass
    public static void  init(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}
    @Test
    public void createCustomerTest(){

        loginTest.login();
        customer.sendFirstName("Marin");
        customer.sendLastName("Aranitasi-auto-1");
        customer.sendTelPrivate("+355695290301");
        customer.sendTelWork("+355695290302");
        customer.sendMobile("+355695290303");
        customer.sendEmail("m_aranitasi@yahoo.com");
        customer.sendEmailWork("m_aranitasi@yahoo.com");
        customer.clickCreateButton();

    }

}
