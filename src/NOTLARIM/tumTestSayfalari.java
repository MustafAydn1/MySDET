package NOTLARIM;

import utils.BaseStaticDriver;

public class tumTestSayfalari extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.selenium.dev/");  //SELENIUM RESMİ SİTESİ....
// target=_blank taglılarını tıklayıp sayfaları switchTo ile açtık.Kapattık. ID lerini ve title aldık..G14


        driver.get("https://triplebyte.com/");
//scrollTo çalışmaları için kullandık.Sonuna git. Şu kadar git. Şuraya kadar git ve şuraya gel...vb.G14


        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
// .isDisplayed  ----  .isEnabled  ---- .isSelected   konusu için hazırlanmış bir sayfa -->> Sonuçları boolean.G9


        driver.get("https://demoqa.com/buttons");
// ActionClick -- doubleClick --rightClick  örnekleri için kullanıldı.G11


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//ActionDragAndDrop ile başkentleri ülkeleri ile eşleştirme.G11


        driver.get("http://demo.guru99.com/test/drag_drop.html");
//dragAndDrop ve clickAndHold çalışmalarında kullanıldı.G11


        driver.get("https://demoqa.com/auto-complete");
//ActionTusKontrolSendKeys  ve YonTuslariSecimi  için kullanıldı.G11






    }
}
