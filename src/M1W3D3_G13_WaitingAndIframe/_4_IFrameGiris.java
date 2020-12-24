package M1W3D3_G13_WaitingAndIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*
Selenium Webdriver'daki iFrame:
        başka bir web sayfasına veya başka bir HTML belgesinin içine gömülü bir HTML belgesine gömülü bir web sayfası
        veya satır içi çerçevedir. İç çerçeve genellikle bir web sayfasına reklam gibi diğer kaynaklardan
        içerik eklemek için kullanılır.
        İframe, < iframe > etiketiyle tanımlanır .
 */
public class _4_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

//iframe 3 farklı şekilde yapılır. Alert te oldugu gibi switchTo ile frame git. Diyoruz.
//Önce o çerçeveye gidiyoruz, switchTo ile...-->> Sonra çerçevenin içindeki belirlenen yere gidiyoruz.



   //    driver.switchTo().frame(0);                               // 1.)indexle bulunabilir.Kaç tane frame varsa.

         driver.switchTo().frame("frame1");               // 2.) id yada name ile bulunabilir.

      // WebElement cerceve1= driver.findElement(By.id("frame1")); // 3.) element olarak bulunabilir.

        //                     driver.switchTo().frame(cerceve1);   // Bu şekilde de diğer sayfaya geçilebilir.




//Sonra çerçevenin içindeki belirlenen yere gidiyoruz. Gittikten sonra istediğin kadar işlem yap.

        WebElement input=driver.findElement(By.cssSelector("input[type='text']"));
        input.sendKeys("Turkiye");









    }

}
/*
     driver.switchTo().frame(0); ---> komutu ile metod oluşturulur...(1)
        driver.switchTo().frame("frame1"); ---> id veya name le de bulunabilir...(2)
        WebElement cerceve1=driver.findElement(By.id("frame1")); ---> element olarak bulunup
        driver.switchTo().frame(cerceve1); ---> bu şekilde de diğer sayfaya geçilebilir...(3)
 */