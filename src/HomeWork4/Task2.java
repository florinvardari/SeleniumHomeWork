package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    /**
     * Hw2:
     * goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
     * 1. u need to write down the code that can select  1 check box out of 4 mentioned,
     * e.g option1 , option2 , option 3, option 4
     *
     * Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");


        
       List<WebElement>  checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement x:checkBoxes) {
            String boxes=x.getAttribute("value");
            if (boxes.equalsIgnoreCase("Option-4")){
               x.click();
            }
        }

    }
}
