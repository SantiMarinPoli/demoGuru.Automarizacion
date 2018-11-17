/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author sala304
 */
public class FlightDetails {
    WebDriver driver;
    By passengers = By.name("passCount");

    
    public FlightDetails(WebDriver driver){

        this.driver = driver;

    }
    
    public void clickPassengers(){
         driver.findElement(passengers).click();
    }
   
    public String getValuePassengers(){
         return driver.findElement(passengers).getAttribute("value");
    }
}
