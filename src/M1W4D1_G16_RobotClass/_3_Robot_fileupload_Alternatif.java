package M1W4D1_G16_RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _3_Robot_fileupload_Alternatif extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/upload/");

        WebElement input=driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\CASPER\\Desktop\\örnek.txt");

        WebElement btn = driver.findElement(By.id("submitbutton"));
        btn.click();

        Thread.sleep(15000);
       // driver.quit();

    }
}
