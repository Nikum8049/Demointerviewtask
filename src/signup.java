import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class signup {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://beta-peter.parsonskellogg.shop/CreateAccount/SignUp");
        driver.manage().window().maximize();


        driver.findElement(By.id("firstname")).sendKeys("Nikunj");
        driver.findElement(By.id("lastName")).sendKeys("Majmudar");
        driver.findElement(By.id("companyName")).sendKeys("ABC");
        driver.findElement(By.id("storeCustomerAddress[0].phone")).sendKeys("9879580089");
        driver.findElement(By.id("email")).sendKeys("Nikunj@gmail.com");
        driver.findElement(By.id("jobTitle")).sendKeys("Software Tester");
        driver.findElement(By.id("password")).sendKeys("Nikunj@4567");
        driver.findElement(By.id("confirmPassword")).sendKeys("Nikunj@4567");
        driver.findElement(By.id("storeCustomerAddress[0].address1")).sendKeys("73, A Thompson Dr N");
        driver.findElement(By.id("storeCustomerAddress[0].address2")).sendKeys("MB canada");
        driver.findElement(By.id("storeCustomerAddress[0].postalCode")).sendKeys("R8N1Z7");
        driver.findElement(By.id("storeCustomerAddress[0].city")).sendKeys("Thompson");

        WebElement country = driver.findElement(By.xpath("//select[@class='form-input' and @name='storeCustomerAddress[0].countryName']"));
        Select countries = new Select(country);
        countries.selectByVisibleText("Canada");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement state = driver.findElement(By.xpath("//select[@class='form-input' and @name='storeCustomerAddress[0].state']"));
        Select states = new Select(state);
        states.selectByVisibleText("Manitoba");

        driver.findElement(By.name("SUBMIT")).click();
    }
}
