package M1W4D3_G18_SoruCozumu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
  Senaryo;
  1- https://www.snapdeal.com/  sitesine gidiniz.
  2- Random Bir tane ürüne tıklatınız.
  3- Açılan yeni window daki ürünü sepete ekletiniz.
  4- Ana Window a dönüp sepete tıklatınız.
  5- Sepete eklenen ürün ile sepete tıklattığınızdaki ekrana çıkan
     ürün ismi aynı olup olmadığını assert ile kontrol ediniz.

*/
public class Soru2WindowHandle extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.snapdeal.com/");
        String anaSayfaId=driver.getWindowHandle();
        System.out.println(anaSayfaId);

        Thread.sleep(3000);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        List<WebElement> urunler=driver.findElements(By.cssSelector("div.product_name"));

      //  Random RandomsayiUreteci=new Random();
       // int random=RandomsayiUreteci.nextInt(urunler.size());
        int random=(int)((Math.random()*(9-5))+4);
        System.out.println(random);

        urunler.get(random).click();

       // driver.findElement(By.id("add-cart-button-id")).click();
        Thread.sleep(3000);
        String yeniSayfaId=driver.getWindowHandle();
        System.out.println(yeniSayfaId);
       // String name=driver.findElement(By.xpath("//span[text()='bhawna collection  Loard Shiv Trishul Damru Locket With Puchmukhi Rudraksha Mala Gold-plated Brass, Wood']")).getText();

       // String name=driver.findElement(By.xpath("//span[@class='active-bread']")).getText();


        Set<String> windows_ids=driver.getWindowHandles(); // açılış sırasını korumak için Set kullanıyrz.

        for(String ID:windows_ids){

            if(ID.equals(anaSayfaId)) continue; // Ana sayfanın Id si gelince atlayacak. yazdırmayacak.

            System.out.println(ID);
            driver.switchTo().window(ID);// diğer ID li sayfaya geçiş yaptı, şu an driver onu temsil ediyor.
            // Framlerden farklı olarak; framelerde diğer frame geçmeden önce ana sayfaya dönmek zorundaydık,
            // windowlarda buna gerek yok, direk istediğimiz windowdan istediğimize geçiş yapabiliyoruz.



            System.out.println("Bulundugu Sayfanın Adı(Title): "+ driver.getTitle());
        }

        String  name=driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
        System.out.println(name);
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("//span[text()='add to cart']")).click();

        driver.close();
        driver.switchTo().window(anaSayfaId);



        Thread.sleep(10000);
        driver.quit();

    }
}

/*
  Robot rbt=new Robot(); //checked Exception oldugu için sleep gibi throws alacak.

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_TAB); //keyPress ile tuşa basıldı.  ....X... da
        rbt.keyRelease(KeyEvent.VK_TAB); //keyRelease tuşu bıraktı.

        Thread.sleep(1000);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        div.bx-wrapper
 */