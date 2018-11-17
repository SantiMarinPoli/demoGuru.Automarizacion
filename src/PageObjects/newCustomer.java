/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author FAMILIA
 */
public class newCustomer {

    WebDriver driver;
    By linkCustomer = By.xpath("/html/body/div[3]/div/ul/li[2]/a");
    By name = By.name("name");
    By dob = By.name("dob");
    By addr = By.name("addr");
    By city = By.name("city");
    By state = By.name("state");
    By pinno = By.name("pinno");
    By telephoneno = By.name("telephoneno");
    By emailid = By.name("emailid");
    By pass = By.name("password");
    By sub = By.name("sub");

    public newCustomer(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkCustomer() {
        driver.findElement(linkCustomer).click();
    }

    public void setName(String strName) {
        driver.findElement(name).sendKeys(strName);
    }

    public void selectSex() {
        try {
            WebElement btnMale = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
            WebElement btnFemale = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]"));
            String genderSelected = "female";

            if (genderSelected.equalsIgnoreCase("male")) {
                btnMale.click();
            } else if (genderSelected.equalsIgnoreCase("female")) {
                btnFemale.click();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setDateOfBrith(String strdob) {
        driver.findElement(dob).sendKeys(strdob);
    }

    public void setAddress(String strAddr) {
        driver.findElement(addr).sendKeys(strAddr);
    }

    public void setCity(String strCity) {
        driver.findElement(city).sendKeys(strCity);
    }

    public void setState(String strState) {
        driver.findElement(state).sendKeys(strState);
    }

    public void setPin(String strPinno) {
        driver.findElement(pinno).sendKeys(strPinno);
    }

    public void setMobileNumber(String strTelephoneno) {
        driver.findElement(telephoneno).sendKeys(strTelephoneno);
    }

    public void setEmail(String strEmail) {
        driver.findElement(emailid).sendKeys(strEmail);
    }

    public void setPassword(String strPass) {
        driver.findElement(pass).sendKeys(strPass);
    }

    public void clickSubmit() {
        driver.findElement(sub).click();
    }



    public void customerApp(String name, String dob, String addr, String city, String state, String pinno, String telephoneno, String emailid, String pass) {
        this.clickLinkCustomer();
        this.setName(name);
        this.selectSex();
        this.setDateOfBrith(dob);
        this.setAddress(addr);
        this.setCity(city);
        this.setState(state);
        this.setPin(pinno);
        this.setMobileNumber(telephoneno);
        this.setEmail(emailid);
        this.setPassword(pass);
        this.clickSubmit();
    }
}
