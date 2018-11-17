package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author FAMILIA
 */
public class withdrawal {

    WebDriver driver;
    By linkDeposit = By.xpath("/html/body/div[3]/div/ul/li[9]/a");
    By accountno2 = By.name("accountno");
    By ammount2 = By.name("ammount");
    By desc2 = By.name("desc");
    By AccSubmit2 = By.name("AccSubmit");

    public withdrawal(WebDriver driver) {
        this.driver = driver;
    }

    public void linkDeposit() {
        driver.findElement(linkDeposit).click();
    }

    public void setAccountNo(String strAccountno) {
        driver.findElement(accountno2).sendKeys(strAccountno);
    }

    public void setAmount(String strAmmount) {
        driver.findElement(ammount2).sendKeys(strAmmount);
    }

    public void setDescription(String strDesc1) {
        driver.findElement(desc2).sendKeys(strDesc1);
    }

    public void clickSubmit() {
        driver.findElement(AccSubmit2).click();
    }



    public void withdrawalApp(String accountno2, String ammount2, String desc2){
        this.linkDeposit();
        this.setAccountNo(accountno2);
        this.setAmount(ammount2);
        this.setDescription(desc2);
        this.clickSubmit();
    }

}
