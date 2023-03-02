package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /**
     *
     * HW1:
     * goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
     * check if the check box    "click on this check box" is Selected
     * if no  Select the check box
     * check gain if the checkbox is Selected or not
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        //* check if the check box    "click on this check box" is Selected
        WebElement isCheckBox=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean boxIs=isCheckBox.isSelected();
        System.out.println("is Check box selected "+boxIs);
        //* if no  Select the check box
        if (!isCheckBox.isSelected()){
            isCheckBox.click();
        }
        //* check gain if the checkbox is Selected or not
        boxIs=isCheckBox.isSelected();
        System.out.println("is Check box selected "+boxIs);



    }
}
