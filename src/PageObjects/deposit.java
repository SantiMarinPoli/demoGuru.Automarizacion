package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author FAMILIA
 */
public class deposit {

    WebDriver driver;
    By linkDeposit = By.xpath("/html/body/div[3]/div/ul/li[8]/a");
    By accountno1 = By.name("accountno");
    By ammount1 = By.name("ammount");
    By desc1 = By.name("desc");
    By AccSubmit1 = By.name("AccSubmit");

    public deposit(WebDriver driver) {
        this.driver = driver;
    }

    public void linkDeposit() {
        driver.findElement(linkDeposit).click();
    }

    public void setAccountNo(String strAccountno) {
        driver.findElement(accountno1).sendKeys(strAccountno);
    }

    public void setAmount(String strAmmount) {
        driver.findElement(ammount1).sendKeys(strAmmount);
    }

    public void setDescription(String strDesc1) {
        driver.findElement(desc1).sendKeys(strDesc1);
    }

    public void clickSubmit() {
        driver.findElement(AccSubmit1).click();
    }


    
    public void despositApp(String accountno1,String ammount1, String desc1){
        this.linkDeposit();
        this.setAccountNo(accountno1);
        this.setAmount(ammount1);
        this.setDescription(desc1);
        this.clickSubmit();
    }

}
