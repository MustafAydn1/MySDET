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
import utils.BaseStaticDriver;

public class dfhfgh extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        driver.manage().window().maximize();

        WebElement selectElement = driver.findElement(By.id("selectOperationDropdown"));
        Select islemler = new Select(selectElement);

        Random sayiUreteci = new Random();
        String EkranIslemSonucu="";

        for (int i = 0; i < 5; i++) {
//             Double sayi1= sayiUreteci.nextDouble() * 100;
//             Double sayi2= sayiUreteci.nextDouble() * 100;

            // Daha önce yaptiklarimizdan farkli bir sekilde Random sayi ürettik.
            int sayi1 = sayiUreteci.nextInt(100);
            int sayi2 = sayiUreteci.nextInt(100);

//            System.out.println(sayi1);
//            System.out.println(sayi2);

            for(WebElement islem : islemler.getOptions()) {

                switch (islem.getText()){
                    case "Add":
                        // Burada islem sectik.
                        islemler.selectByVisibleText("Add");

                        EkranIslemSonucu = EkrandaIslemYap(sayi1,sayi2);
                        // Her ihtimale karsi islemimizin sonucunu yazdirdik.
                        System.out.println("Beklenen="+(sayi1+sayi2)+" EkranSonuc="  + EkranIslemSonucu);
                        //Assert ile islemimizin sonucunu ve ekrandaki sonucunu kontrol ettik.
                        Assert.assertEquals( Integer.toString (sayi1+sayi2), EkranIslemSonucu);
                        break;

                    case "Subtract":
                        islemler.selectByVisibleText("Subtract");// Ekrana yapilacak islemi sec
                        EkranIslemSonucu=EkrandaIslemYap(sayi1,sayi2);// sayi1 ve sayi2 yi ekrana gönderdik ve olusan sonucu aldik.EkrandaIslemYap(sayi1,sayi2); metodu ile
                        System.out.println("Beklenen= "+(sayi1-sayi2)+" Ekran Sonuc= "+EkranIslemSonucu);
                        Assert.assertEquals(Integer.toString(sayi1-sayi2),EkranIslemSonucu);
                        break;

                    case "Multiply":
                        islemler.selectByVisibleText("Multiply");
                        EkranIslemSonucu=EkrandaIslemYap(sayi1,sayi2);
                        System.out.println("Beklenen= "+(sayi1*sayi2)+" Ekran Sonuc= "+EkranIslemSonucu);
                        Assert.assertEquals(Integer.toString(sayi1*sayi2),EkranIslemSonucu);

                        break;

                    case "Divide":
                        islemler.selectByVisibleText("Divide");
                        EkranIslemSonucu=EkrandaIslemYap(sayi1,sayi2);

                        Double sonucDouble=Double.parseDouble(EkranIslemSonucu);
                        Integer sonuc=sonucDouble.intValue();
                        System.out.println("Beklenen= "+(sayi1/sayi2)+" Ekran Sonuc= "+sonuc);
                        Assert.assertEquals(Integer.toString(sayi1/sayi2),sonuc.toString());
                        break;

                    case "Concatenate":
                        islemler.selectByVisibleText("Concatenate");
                        EkranIslemSonucu = EkrandaIslemYap(sayi1, sayi2); // sayı1 ve sayi2 yi ekrana gönderip oluşan sonuç alınıyor.
                        System.out.println("Beklenen=" + sayi1 + sayi2 + " EkranSonuc=" + EkranIslemSonucu); // kendime kontrol
                        String beklenenSonuc= Integer.toString(sayi1) + Integer.toString(sayi2); // yanyana eklendi
                        Assert.assertEquals( beklenenSonuc, EkranIslemSonucu);
                        break;
                }
            }

        }

        Thread.sleep(5000);
        driver.quit();
    }

    //Ekrandaki istenen işlemi yapıp sonucu gönderir.
    public static String EkrandaIslemYap(Integer sayi1,Integer sayi2)
    {
        // 1. Sayiyi gönderdik
        WebElement num1=driver.findElement(By.id("number1Field"));
        num1.clear();
        num1.sendKeys(sayi1.toString());

        //2. sayiyi gönderdik
        WebElement num2=driver.findElement(By.id("number2Field"));
        num2.clear();
        num2.sendKeys(sayi2.toString());

        // Hesapla butonuna bastik. NOT: Islem secme kismini Switch Case icinde yaptik. Burada da yapabilirdik.
        WebElement islemBtn = driver.findElement(By.id("calculateButton"));
        islemBtn.click();

        // Sonucun gelmesi icin bekleme koyduk.
        WebDriverWait bekle=new WebDriverWait(driver, 5);
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.id("answerForm")));

        //Sonucu value attribute nden aldik.
        String islemSonuc = driver.findElement(By.id("numberAnswerField")).getAttribute("value");

        // Sonuc kismini temizledik.
        WebElement clearBtn = driver.findElement(By.id("clearButton"));
        clearBtn.click();

        // Sonucu gönderdik.
        return islemSonuc;
    }
}
