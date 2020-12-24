package M1W4D2_G17_ScreenSize_Shot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.BaseStaticDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
/*
   Senaryo :
        1- https://opensource-demo.orangehrmlive.com/  sitesine gidiniz.
        2- Şifreyi hatalı vererek Login işlemini yapınız.
        3- ekran görünütüsnü kaydediniz.
 */

public class _3_EkranKaydet2 extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {


        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
        driver.findElement(By.id("btnLogin")).click();




            System.out.println("Test Failed");

            TakesScreenshot ts = (TakesScreenshot) driver;  // Casting yapıldı.

            File ekranDosyasi = ts.getScreenshotAs(OutputType.FILE);
//ilk ikisi bir veri tabanına kaydetmek için kullanılır.

              LocalDate date1=LocalDate.now();           // 1- HATASIZ ÇALIŞTI
          //  Date tarihSaat=new Date();                //  2- HATA VERDİ
          //  LocalDateTime date3=LocalDateTime.now(); //   3-HATA VERDİ
          //  LocalTime date2=LocalTime.now();        //    4-HATA VERDİ

// Neden Hata Veriyorlar:: Sanırım 2-3-4 de cıktı verilirken aralarındaki boşluktan dolayı hata veriliyor.
//formatları ile oynanırsa çözulebilir.

            FileUtils.copyFile(ekranDosyasi, new File("ekranGörüntüleri/orangehrm/LoginGirisKontrol"+date1+".png"));



//Aynı yerin başka zamanlarda da kaydı için farklı adlandırmalar yapabilirsin.
//Bunun için Date time kullanmak en makuludur. Bunu yap uygula


        }




    }

