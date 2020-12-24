package M1W2D2_G7_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseStaticDriver;

import java.util.List;

public class ListeYazdirma extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("http://www.saucedemo.com/ ");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name'] ")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


        List<WebElement> listele=driver.findElements(By.xpath("(//div[@class='inventory_item_name'])"));


            for(WebElement aa:listele)

                System.out.println(aa.getText());

    }
}
