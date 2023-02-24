package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         HW2
         navigate to fb.com
         click on create new account
         fill up all the textboxes
         click on sign up button
         close the pop up
         close the browser
         TIP for HW2:
         just fill in text boxes or button, no need to deal with other webElements

         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");


        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Flo");
        driver.findElement(By.name("lastname")).sendKeys("Vard");
        driver.findElement(By.name("reg_email__")).sendKeys("florin231vaffgr@mail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("florin231vard@mail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("florin123");
        driver.findElement(By.name("birthday_month")).sendKeys("Apr");
        driver.findElement(By.name("birthday_day")).sendKeys("15");
        driver.findElement(By.name("birthday_year")).sendKeys("1999");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(3000);
       driver.navigate().to("https://www.facebook.com/");
      Thread.sleep(3000);
      driver.quit();













    }
}
