package M1W3D4_G14_WindowsHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;
/*
   1- https://www.selenium.dev/ sayfasına gidiniz.
   2- yeni syafa açan linklere tıklayınız.
   3- Ana sayfanın haricindeki diğer sayfaları kapatınız.
   4- Ana sayfaya tekrar driverı set ediniz.
 */
public class _3_ClosingWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

      driver.get("https://www.selenium.dev/");

      String anaSayfaId=driver.getWindowHandle();


        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler) {

            link.click();
        }

        Set<String> windows_ids= driver.getWindowHandles();

        for(String id:windows_ids){

            System.out.println(id);

            if(id.equals(anaSayfaId)) continue;

            driver.switchTo().window(id);

            System.out.println("Window title: "+driver.getTitle());

            Thread.sleep(1000);

            driver.close();

        }


        driver.switchTo().window(anaSayfaId);                 // 1
        System.out.println("Window title: "+driver.getTitle());//  2
/* BURADA NELER OLDU:
ÖNCE SADECE 2 i yazdık. Hata verdi. cunku driver en son kapattıgı sayfada(Donate to the Equal Justice Initiative)
işlem yaptıgı(SwictchTo) için orada kaldı.AMA orasıda kapandıgı için o sayfanın title nı alamadı.2 de hataverdi.
BUNU AŞMAK İÇİN DE; 1 i yazarak, driver ı ana sayfaya switchTo yapmış olduk.


 */





    }

}
//if yazmasak ne olurdu. bi incele bakalım.