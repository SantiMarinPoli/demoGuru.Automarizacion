package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Santiago Cortes Marin
 */
public class login {

    WebDriver driver;
    By uid = By.name("uid");
    By password = By.name("password");
    By btnLogin = By.name("btnLogin");
    
    public login(WebDriver driver){
        this.driver = driver;
    }
    
    public void setUid(String StrUid){
        driver.findElement(uid).sendKeys(StrUid);
    }
    
    public void setPassword(String StrPassword){
        driver.findElement(password).sendKeys(StrPassword);
    }
    
    public void clickBtnLogin(){
        driver.findElement(btnLogin).click();
    }
    
    public void ingresarApp(String uid,String password ){
        this.setUid(uid);
        this.setPassword(password);
        this.clickBtnLogin();
    }

}
