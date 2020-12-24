package M1W4D2_G17_ScreenSize_Shot;

import org.openqa.selenium.Dimension;
import utils.BaseStaticDriver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class _1_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html"); // herhangi bir site ile yapılabılır

      Dimension olculer= driver.manage().window().getSize(); // iki Dimension çıkıyor. Dikkat et.java da olanı değil.selenıum olck
//Eger kırmızılıgı çözememişsen; uzerine gel,more action tıkla başka neler var. gör. lazım olanı al...

        System.out.println(olculer.width);
        System.out.println(olculer.height);
// bunlarla kendi kullandığımız ekranın ölçulerini ögrenmiş olduk.Bunu nerede nası kullnacagız.??
//Yaptıgımız testın o anda hangi ölçulerdeki ekranımızda yapıldıgını anlamak için olabılır.Başka??


        Dimension yeniolcu=new Dimension(1024,768);
        driver.manage().window().setSize(yeniolcu);
        // driver.manage().window().setSize(new Dimension(1024,768));  // böyle de yazılır.
//Burada ise açılan pencereleri bu ölçülerle aç demiş olduk.

//Sanırım bunu; bu ölçulerde olan ekranda sitenın nasıl görundugu veya çalıştığını test etmek için kullanacagız...

        System.out.println(yeniolcu);



//Bir sonraki sayfa için kayıt çalışması...
        Date tarihSaat=new Date();
        System.out.println(tarihSaat);

        LocalDate date1=LocalDate.now();
        System.out.println(date1);

        LocalTime date2=LocalTime.now();
        System.out.println(date2);

        LocalDateTime date3=LocalDateTime.now();
        System.out.println(date3);



        String aa="3.123423392572";  // virgul vardı. hata verip durdu... nokta olmalı... bazende sonuna   d isteyebilir.
        double bb=Double.parseDouble(aa);
        double cc=Double.valueOf(aa);

      System.out.println(bb);
      System.out.println(cc);


    }
}
//Dimension:: Boyut

// html5-- responsive(duyarlı) ile  yapılan aynı sayfa; hem bilgisayar ekranında hemde telefon ekranın da kullanılabiliyor.