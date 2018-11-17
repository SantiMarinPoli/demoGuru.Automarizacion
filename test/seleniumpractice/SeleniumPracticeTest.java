/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumpractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.login;
import PageObjects.FlightDetails;
import PageObjects.deposit;
import PageObjects.newAccount;
import PageObjects.newCustomer;
import PageObjects.withdrawal;
import javax.xml.xpath.XPath;

/**
 *
 * @author sala304
 */
public class SeleniumPracticeTest {

    private static WebDriver driver = null;
    login log;
    newCustomer cust;
    newAccount acc;
    deposit dep;
    withdrawal wit;

    public SeleniumPracticeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        driver.get("http://demo.guru99.com/V4/index.php");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    /**
     * Test of main method, of class SeleniumPractice.
     */
    @Test
    public void testMain() {
        try {

            /**
             * LOGIN
             */
            String uid = "mngr163423";
            String password = "vyveqeh";

            log = new login(driver);
            log.ingresarApp(uid, password);

            /**
             * New Customer
             */
            cust = new newCustomer(driver);
            String name = "Ana";
            String dob = "15/10/1996";
            String addr = "Calle 74 40 55b";
            String city = "California";
            String state = "Soltera";
            String pinno = "232323";
            String telephoneno = "316841";
            String emailid = "anamarin@hotmail.com";
            String pass = "ana";
            cust.customerApp(name, dob, addr, city, state, pinno, telephoneno, emailid, pass);
            String getCustomerId = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]")).getText();
            System.out.println("ID Customer: " + getCustomerId);
            Thread.sleep(5000);

            /**
             * New Account
             */
            acc = new newAccount(driver);
            String cusid = getCustomerId;
            String inideposit = "550000";
            acc.AccountApp(cusid, inideposit);
            String getAccountID = driver.findElement(By.xpath("//*[@id=\"account\"]/tbody/tr[4]/td[2]")).getText();
            System.out.println("ID Account: " + getAccountID);
            Thread.sleep(5000);

            /**
             * Deposit
             */
            dep = new deposit(driver);
            String accountno1 = getAccountID;
            String ammount1 = "30000";
            String desc1 = "Deposit1";
            dep.despositApp(accountno1, ammount1, desc1);
            String getCurrent1 = driver.findElement(By.xpath("//*[@id=\"deposit\"]/tbody/tr[23]/td[2]")).getText();
            System.out.println("Deposit");
            System.out.println("Current Balance: " + getCurrent1);
            Thread.sleep(5000);

            /**
             * Withdrawal
             */
            wit = new withdrawal(driver);
            String accountno2 = getAccountID;
            String ammount2 = "250000";
            String desc2 = "Deposit1";
            wit.withdrawalApp(accountno2, ammount2, desc2);
            Thread.sleep(5000);
            String getCurrent2 = driver.findElement(By.xpath("//*[@id=\"withdraw\"]/tbody/tr[23]/td[2]")).getText();
            System.out.println("Withdrawal");
            System.out.println("Current Balance: " + getCurrent2);
            driver.quit();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
