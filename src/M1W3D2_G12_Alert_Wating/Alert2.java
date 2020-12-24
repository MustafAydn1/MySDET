package M1W3D2_G12_Alert_Wating;

import org.openqa.selenium.By;
import utils.BaseStaticDriver;

public class Alert2  extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("asd");
        driver.findElement(By.name("submit")).click();
        System.out.println("Alert Mesaj: " +driver.switchTo().alert().getText());
// Alert in uzerinde yazılı olan metni aldık ve yazdırdık....

       driver.switchTo().alert().accept();
       driver.switchTo().alert().accept();


    }
}
