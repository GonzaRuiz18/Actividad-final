import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static  utils.WebDriverSupliter.getChromeDriver;


public class Actualizacion {

    public static String Actualitation(String firstname, String lastname, String oldpassword, String password, String confirmation)
    {
    WebDriver driver = getChromeDriver();

      driver.get("http://automationpractice.com/index.php?controller=identity");


        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("old_passwd")).sendKeys(oldpassword);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.id("confirmation")).sendKeys(confirmation);
        driver.findElement(By.id("newsletter")).click();


        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();

        return driver.findElement(By.cssSelector(".alert")).getText();
    }
}
