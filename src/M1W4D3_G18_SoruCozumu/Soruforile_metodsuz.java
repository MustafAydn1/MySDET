package M1W4D3_G18_SoruCozumu;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
public class Soruforile_metodsuz extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        WebElement ilk=driver.findElement(By.id("number1Field"));
        WebElement ikinci=driver.findElement(By.id("number2Field"));

        WebElement islemler=driver.findElement(By.id("selectOperationDropdown"));
        Select slc=new Select(islemler);

        //List<WebElement> yapilanlar=driver.findElements(By.cssSelector("#selectOperationDropdown>*"));

        WebElement calculate=driver.findElement(By.id("calculateButton"));

        WebElement onlyInt=driver.findElement(By.id("integerSelect"));

        WebElement result=driver.findElement(By.id("numberAnswerField"));

        WebElement clear=driver.findElement(By.id("clearButton"));


        Random sayiUreteci=new Random();


        for (int j = 0; j <5 ; j++) {

        for (int i = 0; i <5 ; i++) {

            int sayi11 = sayiUreteci.nextInt(100);
            String sayi1 = String.valueOf(sayi11);
            int sayi22 = sayiUreteci.nextInt(100);
            String sayi2 = String.valueOf(sayi22);

            if (i == 0) {
                slc.selectByIndex(i);
                ilk.sendKeys(sayi1);
                ikinci.sendKeys(sayi2);
                onlyInt.click();
                calculate.click();
                int ourAdd = sayi11 + sayi22;
                int intAdd = Integer.parseInt(result.getAttribute("value"));
                Assert.assertEquals(ourAdd, intAdd);
                clear.click();
                ilk.clear();
                ikinci.clear();
                Thread.sleep(2000);
            }
            if (i == 1) {
                slc.selectByIndex(i);
                ilk.sendKeys(sayi1);
                ikinci.sendKeys(sayi2);
                onlyInt.click();
                calculate.click();
                int ourAdd = sayi11 - sayi22;
                int intAdd = Integer.parseInt(result.getAttribute("value"));
                Assert.assertEquals(ourAdd, intAdd);
                clear.click();
                ilk.clear();
                ikinci.clear();

                Thread.sleep(2000);
            }

            if (i == 2) {
                slc.selectByIndex(i);
                ilk.sendKeys(sayi1);
                ikinci.sendKeys(sayi2);
                onlyInt.click();
                calculate.click();
                int ourMult = sayi11 * sayi22;
                int intMult = Integer.parseInt(result.getAttribute("value"));
                Assert.assertEquals(ourMult, intMult);
                clear.click();
                ilk.clear();
                ikinci.clear();

                Thread.sleep(2000);
            }

            if (i == 3) {
                slc.selectByIndex(i);
                onlyInt.click();
                ilk.sendKeys(sayi1);
                ikinci.sendKeys(sayi2);
                Thread.sleep(1000);
                onlyInt.click();
                Thread.sleep(1000);
                calculate.click();
                int ourDivd = sayi11 / sayi22;
                Thread.sleep(1000);
                int intDivd = Integer.parseInt(result.getAttribute("value"));
                Thread.sleep(1000);
                Assert.assertEquals(ourDivd, intDivd);
                clear.click();
                ilk.clear();
                ikinci.clear();

                Thread.sleep(2000);
            }
            if (i == 4) {
                slc.selectByIndex(i);
                ilk.sendKeys(sayi1);
                ikinci.sendKeys(sayi2);
                //onlyInt.click();
                calculate.click();
                String ourConct = sayi1 + sayi2;
                String Cont = result.getAttribute("value");
                Assert.assertEquals(ourConct, Cont);
                clear.click();
                ilk.clear();
                ikinci.clear();

                Thread.sleep(2000);
            }


        }


        }




        Thread.sleep(15000);
        driver.quit();


    }
}
