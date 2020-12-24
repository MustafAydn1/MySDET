package M1W3D4_G14_WindowsHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class _2_SwitchingToWindow extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.selenium.dev/");
        String AnaSayfaID=driver.getWindowHandle();

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler) {

            link.click();

        }

        Set<String> windows_ids=driver.getWindowHandles(); // açılış sırasını korumak için Set kullanıyrz.

        for(String ID:windows_ids){

            if(ID.equals(AnaSayfaID)) continue; // Ana sayfanın Id si gelince atlayacak. yazdırmayacak.

            System.out.println(ID);
            driver.switchTo().window(ID);// diğer ID li sayfaya geçiş yaptı, şu an driver onu temsil ediyor.
            // Framlerden farklı olarak; framelerde diğer frame geçmeden önce ana sayfaya dönmek zorundaydık,
            // windowlarda buna gerek yok, direk istediğimiz windowdan istediğimize geçiş yapabiliyoruz.


//SADECE 2 TANE ID VE SAYFA ADINI VERECEK.
            System.out.println("Bulundugu Sayfanın Adı(Title): "+ driver.getTitle());
        }


        System.out.println(driver.getWindowHandle());

        driver.switchTo().window(AnaSayfaID);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(By.xpath("//div[@class='download-button grid']")).click();

       // driver.findElement(By.xpath("button[aria-label='Close']")).click();//
         //driver.findElement(By.xpath("(//a[text()='Donate'])[1]")).click();

        //driver.findElement(By.xpath("(//a[@ng-bind='faq.question'])[1]")).click();
// if içinde yada  haricinde  == ile equals ın farkını  detayları ile ögren...
        //2 defa google ana sayfa acsak ayni sayfalar ancak sayfa ID leri farkli
        //ayni isimde cok insan var ama, her birisi farkli kisiler
        //degerleri ayni ancak farkli nesneler

        Thread.sleep(10000);
       // driver.quit();
    }
}
