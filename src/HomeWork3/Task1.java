package HomeWork3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * HW
         * use xpath to complete this
         *
         * goto http://practice.syntaxtechs.net/basic-first-form-demo.php
         enter the message in the text box
         click on show message
         Enter value of a
         Enter value of B
         click on the button get total
         also please print the value of the attribute type of the button GET TOTAL

         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php ");
//      enter msg
        WebElement msg=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        msg.sendKeys("That's finish the home work");
//      click on button show message
        WebElement button=driver.findElement(By.xpath("//button[contains(text(), 'Show Message')]"));
        button.click();
        //  enter value a
        WebElement valueA=driver.findElement(By.xpath("//input[@id = 'sum1']"));
        valueA.sendKeys("5");
        //  enter value b
        WebElement valueB=driver.findElement(By.xpath("//input[@id = 'sum2']"));
        valueB.sendKeys("10");
        // click button for total
        WebElement buttonTotal=driver.findElement(By.xpath("//button[contains(text(), 'Get Total')]"));
        buttonTotal.click();
     // print the value of the attribute type
        System.out.println(buttonTotal.getText());


    }
}