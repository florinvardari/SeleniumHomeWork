package HomeWork7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task4 {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
            driver.findElement(By.xpath("//button[@id='enable-button']")).click();

            WebDriverWait wait=new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));

            WebElement enabledButton= driver.findElement(By.xpath("//button[@id='disable']"));
            enabledButton.click();
            boolean isClicked=enabledButton.isEnabled();
        System.out.println(isClicked);
            driver.quit();
    }
}
