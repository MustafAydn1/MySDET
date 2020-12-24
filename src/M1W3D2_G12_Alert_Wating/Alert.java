package M1W3D2_G12_Alert_Wating;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
 /*
     Interview sorusu
       - Alertleri nasıl kullanırsın (handle edersin)

          driver.switchTo().alert()   bununla kullanılır.
          komutları:
          accept -> OK, TAMAM yani olumlu butona basmak
          dismiss -> CANCEL, HAYIR yani olumsuz butona basmak
          getText -> Alertin mesaj alınır.
          SendKeys -> Alertin inputuna mesaj göndermek için kullanılır.
 */

public class Alert extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();

        WebElement clickMe=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        clickMe.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();  // switchTo= alert e geç diyor.
//web sayfasından alert kutucuguna geçildi.tamam a basıldı


        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
        Thread.sleep(1000);

        driver.switchTo().alert().dismiss();

        String str=driver.findElement(By.id("confirm-demo")).getText();

        Assert.assertEquals("hata var...","You pressed Cancel!",str);

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();

        driver.switchTo().alert().sendKeys("Allah a Kul olmaya razı ol");

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        String yazi=driver.findElement(By.id("prompt-demo")).getText();

        Assert.assertTrue(yazi.contains("Allah")); // yazı text inin içinde  Allah kelimesi geçiyorsa doğrudur.
























    }
}
