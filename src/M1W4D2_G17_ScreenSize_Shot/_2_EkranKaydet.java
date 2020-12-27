package M1W4D2_G17_ScreenSize_Shot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.io.File;
import java.io.IOException;
/*
   Senaryo :
        1- https://opensource-demo.orangehrmlive.com/  sitesine gidiniz.
        2- Login işlemini yapınız.
        3- Welcome yazan sağ üst tarafta kullanıcı adının geçip geçmediğini kontrol ediniz.
        4- Eğer Kullanıcı adınız gözükmüyorsa , ekran görünütüsnü kaydedip, ilgili kişiye gönderiniz.
 */
public class _2_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException, InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();


        WebElement isim = driver.findElement(By.xpath("//a[text()='Welcome val']"));
        String isimyeri = isim.getText();
        System.out.println(isimyeri);

        if (isimyeri.contains("Admin")) {
            System.out.println("Test Bşarıyla Geçti");
        } else { // ekran kaydetme işlemi burada olacak...


            System.out.println("Test Failed");
            // 1. Aşama ekran görüntüsü alma değişkenimizi tanımladık.
            TakesScreenshot ts = (TakesScreenshot) driver;  // Casting yapıldı.

            // 2. Aşama alınacak Ekran görüntü dosyası tipi seçilerek hafızada oluşturuldu.
            File ekranDosyasi = ts.getScreenshotAs(OutputType.FILE);
            //. ilk ikisi bir veri tabanına kaydetmek için kullanılır.


            // 3.Aşama ekranDosyasını bir dosyaya yazma/kopyalama işlemi yapılıyor.
            // DosyaKopyala (ekranDosyası, ekranGoruntusu.png);
            //BURADA EKRAN FOTOSUNU RESİM DOSYASI OLARAK KAYDETTİRECEZ.AMA,
            // Yukarıdaki komut JAVA nın için de yok, bunun için diğer yapılmış bir kütüphane
            // bulup AYNI SELENYUMU eklediğimiz ekleyeceğiz. bu kütüphane common.io bu apache isimli siteden indirilecek.


            FileUtils.copyFile(ekranDosyasi,new File("ekranGörüntüleri/orangehrm/LoginKontrol.png"));
            // hafızadaki ekranDosyasi nı al bunu verdiğim yola ve isme kaydet.
            // jpg,bmp,gif .. olabilir.

        }

        Thread.sleep(10000);
        driver.quit();





//Aynı yerin başka zamanlarda da kaydı için farklı adlandırmalar yapabilirsin.
//Bunun için Date time kullanmak en makuludur. Bunu yap uygula.







//2. ders 10. dak. önemli
//apacheapache nedir? 17. gun 10. dak....  web sunucusu,  serbest yazılım platformu...
//websayfasının bıze sunumunu saglıyor.

//
//https://mvnrepository.com/artifact/commons-io/commons-io/2.7 // bu libs i indirdiğim yer.

        //Assert.assertEquals("Admin",isimyeri); // Admin yazması gerekirken Linda yazdı.
        // Bunun yaparsam sistem durur. devam edebilmek için bunun yerine if konuldu.



//bugunkü 2. dersi tekrar dinle. cok sey var.


    }
}
