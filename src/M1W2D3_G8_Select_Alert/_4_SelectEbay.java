package M1W2D3_G8_Select_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;
/*
  Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz. value sini kastediyor.
  3- Arama işlemini yaptırınız.

 */

public class _4_SelectEbay  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //sitelerin bizim bilgileirmizi tutarak bazen engel çıkardığı cookiesleri otomatık sildik.. Hergirişte...
        Thread.sleep(1000);

        WebElement ara=driver.findElement(By.id("gh-cat"));
// incele de nereyi gösterirse oradaki bilgiyi al....mavilik alan...
// Burada select siz çözemezsin. degeri girin demek value den demektir.

        /*
        ara.click();
        driver.findElement(By.xpath("//option[@value='2984']")).click();
     Selectsiz de çözulebiliyormuş... Ama sen yine de Selectle calış. Boşuna değildir.

         */

       Select degerGir=new Select(ara);
       degerGir.selectByValue("2984");

        driver.findElement(By.id("gh-btn")).click();



        Thread.sleep(60000);
        driver.quit();


    }
}
