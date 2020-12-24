package M1W3D2_G12_Alert_Wating;

import org.openqa.selenium.By;
import utils.BaseStaticDriver;

import java.util.concurrent.TimeUnit;
/*
Selenium Bekletme Konusu:
      Thread.sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

       Implicit wait :
       Tüm sayfadaki elemanalr için bir bekleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
       Bütüm elemanlar geçerli.NoSuchElement hatası nı vermek için verilen süre kadar  eleman bulunana kadar bekler.

                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES)

       pageLoadTimeout :
       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
       30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
       driver.get() de  driver.navigate.To


 */
public class WaitsIntro  extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Sadece WEBELEMENT içindir.

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


        driver.findElement(By.cssSelector("button[onclick='timedText()']")).click();
/*
        System.out.println(driver.findElement(By.id("demo")).getText());
        System.out.println(driver.findElement(By.id("demo")).getText());
        System.out.println(driver.findElement(By.id("demo")).getText());

//id='demo' yazılı yerde 3 farklı text yazılıyor, ardarda demo ile bunu alamadım. xpath text ile alındı
//Aç-bak farkı gör
 */
        System.out.println(driver.findElement(By.xpath("//p[text()='Selenium']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[text()='QTP']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[text()='WebDriver']")).getText());


//id='demo' yazılı yerde 3 farklı text yazılıyor, ardarda demo ile bunu alamadım. xpath text ile alındı

    }
}
// Yavaş olan site işleyişlerini hızlandıramayacagımız için IDE nın işleyişini yavaşlatıyoruz.