package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         HW1:
         navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
         fill out the form
         click on register
         close the browser
         */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");


        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Florin");
        driver.findElement(By.name("customer.lastName")).sendKeys("Vardari");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Main st");
        driver.findElement(By.id("customer.address.city")).sendKeys("Ashburn");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20147");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("florin123");
        driver.findElement(By.id("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
       driver.findElement(By.xpath("//input[@value='Register']")).click();

       Thread.sleep(4000);

        driver.quit();



    }
}
