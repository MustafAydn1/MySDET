package M1W3D3_G13_WaitingAndIframe;

import org.openqa.selenium.By;
import utils.BaseStaticDriver;

public class _5_IFrameCikanEkraniKapat extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        driver.switchTo().frame("flow_close_btn_iframe"); // ÖNCE; iframe çercevesine girdik.İnceleden

        driver.findElement(By.id("closeBtn")).click();           //SONRA; Çerçevenin içinde işlemi yaptık.Çerçeveden X kapat



//iframe mi? değil mi? Anlamak için     1.)  -->>İncele-->ctrl f ile iframe arat.
//                                      2.)  -->> Üzerine gel -->> Sağ tuş Çerçeve Kaynağını incele linki de çıkar.


//Google reklemları da böyledir.
//Ama alertler böyle değil.Çünkü Kodlarda yokturlar.Webelement değildir.

//Manuel test yapılmadan automation test e geçilmez.
    }
}
