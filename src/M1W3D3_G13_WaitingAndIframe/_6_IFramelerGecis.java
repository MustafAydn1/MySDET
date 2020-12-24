package M1W3D3_G13_WaitingAndIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

//AYNI SAYFADAKİ İKİSİ FARKLI VE BİRİDE İÇİÇE OLAN FRAME LERE NASIL GEÇİŞLER YAPILACAK.

public class _6_IFramelerGecis extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1"); // ilk Çerçeveye (frame) gidildi

       WebElement input=driver.findElement(By.cssSelector("input[type='text']")); //Turkiye yazıldı
       input.sendKeys("Turkiye");


/*BU KISIMDA NELERİ YAP(AMA)DIM::: İÇİÇE FRAME

KUTUCUGU TIKLATMAK İÇİN:: 1  yazdım. olmadı.
sanırım farklı frame diye 2 yi yazdım olmadı.
bir ust frame cık diye    3 ü yazdım olmadı.
baktım ki içiçe frame miş.4 ü yazdım oldu.
Direk içine girdim.
Inner Frame Check box :İç Çerçeve Onay kutusu

 */
        // driver.switchTo().parentFrame();     // 3
       // driver.switchTo().defaultContent();  // 2

        driver.switchTo().frame("frame3");  //4

        driver.findElement(By.cssSelector("input[id='a']")).click(); // 1

//Yanında scroll var. Turkiye ve İnner checkbox ya aynı frame dir. yada içiçe dir. bunu da kodlardan anlarsın.






// ŞU ANDA İLK ÇERÇEVEDEYİM. İKİNCİ FRAME GEÇMEK İÇİN BU ÇERCEVEDEN ÇIKIP ÖNCE ANA SAYFAYA DÖNMELİYİM.

        driver.switchTo().defaultContent(); // ana sayfaya dönuş kodu....
        // driver.switchTo().parentFrame(); // Bir geri sayfaya git demektir.defaultContent ile benzer işi yapar


// SONRA ikinci frame girip, oradaki işlemi yapmam lazım.

        driver.switchTo().frame("frame2"); // 2. frame girdim.

        Select slc=new Select(driver.findElement(By.id("animals"))); // 2. frame deki işlemi yaptım
        slc.selectByIndex(1);


// bu işlemlerde BaseStaticDriver daki implicitWait i 30 Yaparsam Turkiye ve Bayb Cat yazıları için 30 ar sanıye beklıyor
// 5 sn dersem 5 bekliyor. Niye bekliyor ki..????







    }
}
