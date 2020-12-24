package M1W4D1_G16_RobotClass;

import utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
/*
     İnterview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la

     Fare ve klavye kullanmadan test yapmamızı saglar.

    BUNLARIN KODLARI inceleden çıkmaz çünkü yok...
 */
public class _1_RobotIntro  extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException, InterruptedException {
        driver.get("http://www.cleartrip.com/");


        Robot rbt=new Robot(); //checked Exception oldugu için sleep gibi throws alacak.

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_TAB); //keyPress ile tuşa basıldı.  ....X... da
        rbt.keyRelease(KeyEvent.VK_TAB); //keyRelease tuşu bıraktı.

        Thread.sleep(3000);

        rbt.keyPress(KeyEvent.VK_TAB);  // .......İzin Ver....
        rbt.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(4000);

        rbt.keyPress(KeyEvent.VK_TAB); // .....Engelle.....
        rbt.keyRelease(KeyEvent.VK_TAB);
// 3 kez tab a basılıp geri çektik. Çıkan popup un uzerinde X ve buttonlarda gezindik.

        Thread.sleep(3000);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

// enter ile de istediğin butona tıklarsın.

        //VK:: Virtual Key ::  sanal anahtar


        Thread.sleep(15000);
        driver.quit();
    }
}
// enter ile istediğim yerde kapatamıyorum. bi garip çalışıyor.
/*
     Robot Sınıfı
    Selenium'daki Robot Sınıfı , Java platformunun uygulamaları için otomatik testi etkinleştirmek için kullanılır.
    Kullanıcıların fare ve klavye üzerinde kontrole ihtiyaç duyduğu test otomasyonu, kendi kendine çalışan demolar
    ve diğer uygulamalar için yerel sistemlerde girdi olayları oluşturur. Robot sınıfının uygulanması kolaydır ve
    otomatikleştirilmiş bir çerçeve ile kolayca entegre edilebilir.

        Selenium'da Robot Sınıfı kullanılır,
        çünkü bazı Selenium otomasyon testlerinde, kullanıcıların indirme açılır pencereleri,
    açılır pencereler vb. Gibi işletim sistemi pencereleriyle ve not defteri, hesap makinesi gibi yerel uygulamalarla
    etkileşimde bulunmak için klavye veya fare üzerinde kontrole ihtiyacı vardır. Selenium Webdriver bu açılır
    pencereleri / uygulamaları işleyemez, bu nedenle Java sürüm 1.3'te işletim sistemi açılır pencerelerini / uygulamalarını
    işleyebilen robot sınıfı tanıtıldı.
 */