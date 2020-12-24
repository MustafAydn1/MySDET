package M1W4D3_G18_SoruCozumu;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

import java.util.Random;
/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */
public class Soruswitchile extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement ilk=driver.findElement(By.id("number1Field"));
        WebElement ikinci=driver.findElement(By.id("number2Field"));

        WebElement islemler=driver.findElement(By.id("selectOperationDropdown"));
        Select slc=new Select(islemler);

        WebElement Calculate=driver.findElement(By.id("calculateButton"));

        WebElement result=driver.findElement(By.id("numberAnswerField"));

        WebElement clear=driver.findElement(By.id("clearButton"));


        Random sayiUreteci=new Random();
        String ekranSonucu=""; // String olan bu ifadeyi aşagıda defalarca kullanmak için en uste yazdık.

        for (int i = 0; i <5 ; i++) {

           int sayi1=sayiUreteci.nextInt(100);
           int sayi2=sayiUreteci.nextInt(100);


           for(WebElement islem: slc.getOptions()){

               switch(islem.getText()){

                   case "Add": slc.selectByVisibleText("Add");
                       ekranSonucu=EkranIslemi(sayi1,sayi2);
                       System.out.println("Benim Sonucum= "+(sayi1+sayi2)+"  Ekranın Sonucu= "+ekranSonucu);
                       Assert.assertEquals(Integer.toString(sayi1+sayi2),ekranSonucu); // ekran sonucu String oldugu için
                       // ekran sonucu String oldugu için, kendi sonucumuzu da Integer.toString ile Casting yaptık.
                       break;

                   case "Subtract":  slc.selectByVisibleText("Subtract");
                       ekranSonucu=EkranIslemi(sayi1,sayi2);
                       System.out.println("Benim Sonucum= "+(sayi1-sayi2)+"  Ekranın Sonucu= "+ekranSonucu);
                       Assert.assertEquals(Integer.toString(sayi1-sayi2),ekranSonucu);
                       break;

                   case "Multiply":  slc.selectByVisibleText("Multiply");
                       ekranSonucu=EkranIslemi(sayi1,sayi2);
                       System.out.println("Benim Sonucum= "+(sayi1*sayi2)+"  Ekranın Sonucu= "+ekranSonucu);
                       Assert.assertEquals(Integer.toString(sayi1*sayi2),ekranSonucu);
                       break;

                   case "Divide":   slc.selectByVisibleText("Divide");
                       ekranSonucu=EkranIslemi(sayi1,sayi2); // bu strıng ve double tarzı bi ifade.Direk int olmaz.
                      Double doubleEkranSonuc=Double.parseDouble(ekranSonucu);
                      // int intEkranSonucu= (int) doubleEkranSonuc; //direk bu yapılabilir.Ama olmaz.üst Wrapper
                       Integer intEkranSonucu= doubleEkranSonuc.intValue();
                       // BU BENDE NEDEN OLMUYORDU.ilk başta 73. satır double doubleEkranSonuc= kucuk ile tanımlıydı.

                       System.out.println("Benim Sonucum= "+(sayi1/sayi2)+"  Ekranın Sonucu= "+intEkranSonucu);
                       //SORU: "Benim Sonucum= "+(sayi1/sayi2) bu kısım neden ondalıklı çıkmıyor??? çünkü int/int daima int tir.

                       Assert.assertEquals(Integer.toString(sayi1/sayi2),intEkranSonucu.toString());
                       break;

                   case "Concatenate":   slc.selectByVisibleText("Concatenate");
                       ekranSonucu=EkranIslemi(sayi1,sayi2);

                       System.out.println("Benim Sonucum= "+ sayi1+sayi2 +"  Ekranın Sonucu= "+ekranSonucu);
                       String StrOlmasiniIstedigimizSonuc=Integer.toString(sayi1)+Integer.toString(sayi2);
                       Assert.assertEquals(StrOlmasiniIstedigimizSonuc,ekranSonucu);

                       break;
               }

           }

        }
    }
    public static String EkranIslemi(Integer sayi1,Integer sayi2){

        WebElement ilk=driver.findElement(By.id("number1Field"));
        ilk.clear();
        ilk.sendKeys(sayi1.toString());  // sayi1 olarak bırakırsam int i kabul etmez. String ister.

        WebElement ikinci=driver.findElement(By.id("number2Field"));
        ikinci.clear();
        ikinci.sendKeys(sayi2.toString()); // sayi2 Integer belirtildi.String farklı bır cevirme yöntemi.


        WebElement calculate=driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebDriverWait bekle=new WebDriverWait(driver,5);
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.id("answerForm")));

        WebElement result=driver.findElement(By.id("numberAnswerField"));

        String islemSonucu=result.getAttribute("value");

        WebElement clear=driver.findElement(By.id("clearButton"));

        return islemSonucu;
    }
}

 /* BU SORUDA ÖĞRENDİKLERİM:::

BAŞTAN Wrapper Class olarak tanımladıgın bir sayı yol boyunca tüm çevirilirde Wrapper Class özellikleri ile çevrilir.
Biz metodda Parametreleri baştan öyle tanımladık.Stringe,Double ye ona göre çevirdik.

Integer yapınca .toString ile de String e çevriliyor... WrapperClass ın fazla özelliksahibi olmasından dolayı...

KENDİSİ ondalıklı sayı olan String bir ifade direk Integere çevrilemez. Önce Double a sonra integer a cevireceksin.
Integer intEkranSonucu= doubleEkranSonuc.intValue(); Başka bir Wrapper Casting özelliği

getText ile elemanın sabit yazılı olanlarını alırız. Burada sonuclar sabit değil.BU CÜMLE HERZAMAN DOĞRU MU????!!!!

html de bir başlangıc degeri atmak istersen value ile atarsın.
yine degeri de value ile alırsın.
Burada value nın degerinin gözukmeme sebebi javascript ile yazıldığı için.

explicit beklemede sadece o noktanın degil bazen daha genel kısmından almakta fayda var.
Burada answer kısmını degilde ,form kısmından aldık...

concanete parantez olmamalı... olursa parantez i toplama olarak algılıyor... denedim.Gördüm.
 */

/*

Bu soruyu Swicht ile neden yapamadım.

1-) case "Subtract":  slc.selectByVisibleText("Subtract");   bu kısmı yazmadıgım için, switch çalışmadı...
2-)Metodu neden kuramadım: Metodun içinde de illa ki Random sayı olması gerektiği düşüncesi ile
sayı1 ve sayı2 yi metoda taşıyamadım.
Oysaki metod da herhangi iki sayı olacaktı.Mainde de o herhangi ikisayı random ile atanacaktı...



 */