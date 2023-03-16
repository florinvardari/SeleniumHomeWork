package HomeWork8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();
        WebElement PIM= driver.findElement(By.xpath("//b[text()='PIM']"));
        PIM.click();
       List<WebElement> iD=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i <iD.size() ; i++) {
           String text=iD.get(i).getText();
           if (text.equalsIgnoreCase("18633518")){
               System.out.println("The id is in row nr "+(i+1));
             driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();


           }
        }

        driver.quit();

    }
}
