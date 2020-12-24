package PROJELER.ODEVLER.Proje4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class Proje4 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.e-shopland.ch/sellacious/index.php");

        driver.findElement(By.cssSelector("i.search-icon.fa.fa-search")).click();

        driver.findElement(By.cssSelector("input[id^='finder']")).sendKeys("Canon");

        driver.findElement(By.cssSelector("button[class='btn btn-primary findersubmit btn-right']")).click();

        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-add-cart add'])[1]")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-small btn-primary']")).click();

        driver.findElement(By.id("login_email")).sendKeys("ali@gmail.com");

        driver.findElement(By.id("login_email_submit")).click();

        driver.findElement(By.id("btn_guest_checkout")).click();

        driver.findElement(By.id("jform0_name")).sendKeys("Ali");

        WebElement save= driver.findElement(By.cssSelector(".btn.btn-primary.btn-save-address"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",save);

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//b[@role='presentation'])[1]")).click();

        List<WebElement> ulke=driver.findElements(By.cssSelector("#select2-results-3>*"));

        Random sayiuret=new Random();
        Thread.sleep(1000);

        int sayi=sayiuret.nextInt(ulke.size());

        ulke.get(sayi).click();
        Thread.sleep(2000);

       save.click();

       driver.findElement(By.cssSelector(".btn.btn-small.btn-default.btn-bill-here")).click();
       driver.findElement(By.cssSelector(".btn.btn-small.btn-default.btn-ship-here")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("(//a[@class='btn btn-small btn-default btn-next pull-right'])[1]")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[@class='btn btn-small btn-default btn-next pull-right'])[2]")).click();


       WebElement payment=driver.findElement(By.xpath("(//button[@class='btn-next btn btn-primary'])"));

        Thread.sleep(1000);

        js.executeScript("window.scrollBy(0,900)");
        Thread.sleep(2000);

        payment.click();

        Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0,-200)");

        //driver.findElement(By.xpath("//a[text()='Cheque']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button[text()='PAY NOW'])[1]")).click();

        Thread.sleep(1000);
        WebElement yazi=driver.findElement(By.xpath("//p[contains(text(),'Payment via')]"));
        String aa=yazi.getText();

        Assert.assertEquals(aa,"Payment via Cheque approved.");

        Thread.sleep(1000);
        WebElement text=driver.findElement(By.xpath("(//h4[@class='alert-heading'])[2]"));
        String Txt=text.getText();
        Assert.assertEquals("success",Txt);
        Thread.sleep(1000);

        String ilkSayfa=driver.getWindowHandle();
        System.out.println("ilk sayfa ıd si =" + ilkSayfa);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='VIEW INVOICE']")).click();
        System.out.println("nerdesin id= "+driver.getWindowHandle());

        driver.switchTo().window(ilkSayfa);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='VIEW RECEIPT']")).click();


        Thread.sleep(4000);


        Set<String> windows_ids=driver.getWindowHandles(); // açılış sırasını korumak için Set kullanıyrz.

        for(String ID:windows_ids){

            if(ID.equals(ilkSayfa)) continue; // Ana sayfanın Id si gelince atlayacak. yazdırmayacak.

            System.out.println(ID);
            driver.switchTo().window(ID);

            System.out.println("Bulundugu Sayfanın Adı(Title): "+ driver.getTitle());
        }



        WebElement email=driver.findElement(By.xpath("(//div[@class='sub-title text-center'])[1]"));
        String yazi1=email.getText();
        System.out.println(yazi1);

        Assert.assertEquals(yazi1,"for ali@gmail.com");








        Thread.sleep(15000);
       // driver.quit();

    }
}
/*
 *"Https://demo.sellacious.com/squick/" sayfasına gidin
 *  * Arama simgesine tıklayın ve "Canon" u arayın
 * * "Canon" kamera için "Add to cart" a tıklayın
 *    * "Ödeme Yap" ı tıklayın
 * Email adresini girin ve ""Proceed" e tıklayın.
 * "Checkout as Guest"  te tıklayın.
 * Formu doldurun.(rastgele bir ülke seçilmeli) - (Eyalet ve ilçe için hiçbir şey seçmeyin)
 * Save butonuna tıklayın
 * Adresin altındaki 'Bill Here' ve 'deliver here' butonuna tıklayın ve devam etmek için oka tıklayın
 * Devam etmek için ok butonuna tıklayın
 * "Proceed to payment" butonuna tıklayın
 * "Cheque" ve "pay now" butonuna tıklayın. (burada bir bug var)
 * "Adress Adress" kutucugunu kapatmak için X 'e basın. (thread sleep)
 * "Cheque" e tıklayın ve "Pay Now" butonuna tekrar basın.
 * "Payment via Cheque approved" mesajının görüntülendiğini dogrulayın
 * Success" mesajının görüntülendiğini doğrulayın
 * "View Invoice" butonuna tıklayın ve doğru ürünü siparis ettiginizi onaylayın.
 * "View Receipt" e tıklayın ve e postanızın makbuzda dogru yazıldıgını kontol edin, onaylayın.
 *
 */

