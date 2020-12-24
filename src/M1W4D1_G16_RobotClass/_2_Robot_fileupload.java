package M1W4D1_G16_RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _2_Robot_fileupload extends BaseStaticDriver {

    public static void main(String[] args) throws AWTException, InterruptedException {

        driver.get("http://demo.guru99.com/test/upload/");

//ilk 30 dak dinle... 2.dersin...
//bu kısım ilk çıkan  reklamı kapatıyor.
        WebDriverWait bekle=new WebDriverWait(driver,20);
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.id("flow_close_btn_iframe")));
//id si verilen frame ziyaret edilebilir oldugu ana kadar bekle. 20 sn bekle,sonra hata ver.  ---ExplicitWait---

       //bekle.until(ExpectedConditions.visibilityOf()) // bunu burada kullanamayız.çünkü ortada webelement yok.
// bunu burada kullanamayız.çünkü ortada webelement yok.içinr Webelement bekliyor.

        driver.switchTo().frame("flow_close_btn_iframe"); // frame çerçeveye gir.
        WebElement kapatButonu = driver.findElement(By.id("closeBtn")); // kapat X tsunun elemanı
        kapatButonu.click();

        driver.switchTo().defaultContent(); //Anasayfamıza dön.çünkü iframe girmiştik.Çıkmalıyız.yoksa driver orada kalır

        WebElement btntikla= driver.findElement(By.id("file_wraper0"));
        btntikla.click();

//Benım verdiğim Stringi hafızaya-clıpboard a kopyalama kodu.
        StringSelection stringSelection = new StringSelection("C:\\Users\\CASPER\\Desktop\\örnek.txt"); //son kısmı yazmıyr.
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
//Benim verdiğim String  i clipboarda set ediyor.


//Bu kodun oldugunu bil. Nasıl bulacagını bil.Hangi durumda bu kodu kullanmak gerktiğini bil...
//StringSelection un sonunun içini biz doldurduk.


        Thread.sleep(3000);
        Robot rbt=new Robot();

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);   // bunu yazmasamda olabilir mi... oldu da...

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);








Thread.sleep(15000);
driver.quit();


    }

// clipboard  deniyor. bu kopyalamaya...
//selenıum clipboard diye ara incele. nette
}
