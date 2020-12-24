package M1W2D2_G7_Xpath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

/*
1- https://www.saucedemo.com/ sitesini açınız.
        2- login işlemini yapınız (login işlemi ayrı bir static metodda olsun ordan çağırınız)
        3- Açılan sayfadaki bütün ürünleri sepete ekleyiniz.
        4- Sepete tıklayınız
        5- Sepette listelenen bütün ürünleri REMOVE yapınız.
     6- Sağ üst taraftaki sepet imajındaki ürün sayısını gösteren yerin boş olduğunu
   Assert ile kontrol ediniz.
 */
public class SepetEkle_Sil extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        logIn("standard_user","secret_sauce");
       // driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        List<WebElement> ekle=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

        for(WebElement e: ekle){
            e.click();
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/*/*/*")).click();

        List<WebElement> sil=driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']"));

        for(WebElement s:sil){
            s.click();
            Thread.sleep(1000);
        }

// Bunun yerini yanliş bulmuşum. tekrar incele... sepetin uzerindeki sayıyı bulacaksın.sepeti değil... farket...
     List<WebElement> bosSepet=driver.findElements(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));


       Assert.assertTrue(bosSepet.size()==0);
       // Assert.assertNull(bosSepet.size()); // bu olmadı .. Neden...


    }
    public static void logIn(String username,String password){
        driver.get("http://www.saucedemo.com/ ");
        driver.manage().window().maximize();

        WebElement isim=driver.findElement(By.xpath("//input[@id='user-name']"));
        isim.sendKeys(username);
        WebElement pswrd=driver.findElement(By.xpath("//input[@id='password']"));
        pswrd.sendKeys(password);
        WebElement clik=driver.findElement(By.xpath("//input[@id='login-button']"));
        clik.click();

    }

}
