
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author FAMILIA
 */
public class newAccount {

    WebDriver driver;
    By linkAccount = By.xpath("/html/body/div[3]/div/ul/li[5]/a");
    By cusid = By.name("cusid");
    By selaccount = By.name("selaccount");
    By inideposit = By.name("inideposit");
    By button2 = By.name("button2");

    public newAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void linkAccount() {
        driver.findElement(linkAccount).click();
    }

    public void setAccountId(String strCusid) {
        driver.findElement(cusid).sendKeys(strCusid);
    }

    public void selectedTypeAccount() {
        try {
            WebElement selAccount = driver.findElement(selaccount);
            Select acco = new Select(selAccount);

            /**
             * Select ByIndex tiene dos opciones 0 o 1
             */
            acco.selectByIndex(0);
            Thread.sleep(3000);

            /**
             * Puedes seleccionar Savings o Current
             */
            acco.selectByValue("Savings");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setInitialDeposit(String strInideposit) {
        driver.findElement(inideposit).sendKeys(strInideposit);
    }

    public void clickSubmit() {
        driver.findElement(button2).click();
    }



    public void AccountApp(String cusid, String inideposit) {
        this.linkAccount();
        this.setAccountId(cusid);
        this.selectedTypeAccount();
        this.setInitialDeposit(inideposit);
        this.clickSubmit();
    }

}
