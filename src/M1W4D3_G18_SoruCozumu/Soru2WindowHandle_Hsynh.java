package M1W4D3_G18_SoruCozumu;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.Set;
/*
Senaryo;
1- https://www.snapdeal.com/  sitesine gidiniz.
2- Random Bir tane ürüne tıklatınız.
3- Açılan yeni window daki ürünü sepete ekletiniz.
4- Ana Window a dönüp sepete tıklatınız.
5- Sepete eklenen ürün ile sepete tıklattığınızdaki ekrana çıkan
ürün ismi aynı olup olmadığını assert ile kontrol ediniz.
*/
public class Soru2WindowHandle_Hsynh extends BaseStaticDriver {


    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.snapdeal.com/");
        String anaSayfaIDsi = driver.getWindowHandle();



    WebElement birinciUrun = driver.findElement(By.cssSelector("div[class='trendingProd product-relative dp-widget-link col-xs-5 favDp'][index='0']"));
    WebElement ikinciUrun = driver.findElement(By.cssSelector("div[class='trendingProd product-relative dp-widget-link col-xs-5 favDp'][index='1']"));
    WebElement ucuncuUrun = driver.findElement(By.cssSelector("div[class='trendingProd product-relative dp-widget-link col-xs-5 favDp'][index='2']"));
    WebElement dorduncuUrun = driver.findElement(By.cssSelector("div[class='trendingProd product-relative dp-widget-link col-xs-5 favDp'][index='3']"));
    WebElement besinciUrun = driver.findElement(By.cssSelector("div[class='trendingProd product-relative dp-widget-link col-xs-5 favDp'][index='4']"));
    WebElement altinciUrun = driver.findElement(By.cssSelector("div[class='trendingProd product-relative dp-widget-link col-xs-5 favDp'][index='5']"));
    int rdm = (int)(Math.random()*6); // 0 dan 5 e kadar 6 urun var...
        System.out.println(rdm);
    String urunText = "";

        switch (rdm){
        case 0:{
            WebElement urun = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[1]"));
            urunText = urun.getText();
            System.out.println(urunText);
            birinciUrun.click();
            urunEkle();
            break;
        }
        case 1:{
            WebElement urun = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[6]/a/div[3]/div[1]"));
            urunText = urun.getText();
            System.out.println(urunText);
            ikinciUrun.click();
            urunEkle();
            break;
        }
        case 2:{
            WebElement urun = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[7]/a/div[3]/div[1]"));
            urunText = urun.getText();
            System.out.println(urunText);
            ucuncuUrun.click();
            urunEkle();
            break;
        }
        case 3:{
            WebElement urun = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[8]/a/div[3]/div[1]"));
            urunText = urun.getText();
            System.out.println(urunText);
            dorduncuUrun.click();
            urunEkle();
            break;
        }
        case 4:{
            WebElement urun = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[9]/a/div[3]/div[1]"));
            urunText = urun.getText();
            System.out.println(urunText);
            besinciUrun.click();
            urunEkle();
            break;
        }
        case 5:{
            WebElement urun = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[10]/a/div[3]/div[1]"));
            urunText = urun.getText();
            System.out.println(urunText);
            altinciUrun.click();            // burada hata verdi.
            urunEkle();
            break;
        }
    }

        driver.switchTo().window(anaSayfaIDsi);
    WebElement sepet = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[1]/div/i"));
        sepet.click();

    WebElement title = driver.findElement(By.xpath("//*[@id=\"rtbScriptContainer\"]/div[5]/ul/li/div[3]/div[1]/div/a"));
    String sepetteki = title.getAttribute("title");
        System.out.println("WEB TITLE : " + sepetteki);

        Assert.assertEquals("Hatali ürün ismi !!" ,urunText , sepetteki);

        Thread.sleep(4000);
        driver.quit();

}

    public static void urunEkle() throws InterruptedException {
        Set<String> windowID = driver.getWindowHandles();
        for (String  id: windowID) {
            driver.switchTo().window(id);
        }

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]/span"));
        addToCart.click();
        Thread.sleep(1000);
        driver.close();
    }
}


