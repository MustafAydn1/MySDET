package PROJELER.Proje2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

/*

1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın . Sign in button'ına tıklayınız.

3) Transfer founds butonuna tıklayınız.

4) From account kısmından herhangı bir(Random'la tıklatın) değer seçınız.

5) To account kısmından herhangı bir(Random'la tıklatın.) değer seçınız.

6) Her hangi bir amount gırınız.

7) Her hangi bir description giriniz.

8)Continue butonuna tiklayiniz.

9)Submit butonuna tiklayiniz.

10) "You successfully submitted your transaction" Yazısı gözükmesi gerekiyor.


 */
public class _1_ extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {


        signIn("username","password");

        driver.findElement(By.linkText("Transfer Funds")).click();

        driver.findElement(By.id("tf_fromAccountId")).click();

List<WebElement> fromacc=driver.findElements(By.cssSelector("select[id='tf_fromAccountId']>option"));

    int aa=(int)(Math.random()*fromacc.size()); // java da index 0 dan başlar ama html de 1 den başlar...
        // Bu yuzden size()+1 eklemeye gerek yok....
   // bunun value olarak... deneyelim...

        fromacc.get(aa).click();

     driver.findElement(By.name("toAccountId")).click();
/*
      WebElement cc=driver.findElement(By.xpath("//select[@name='toAccountId']/*"));
        Select dd=new Select(cc);
        int rand=((int)(Math.random() * (6)));
        String str=String.valueOf(rand);
        dd.selectByValue(str);
 */

        List<WebElement> toAcc=driver.findElements(By.xpath("//select[@name='toAccountId']/*"));

        int random=(int)(Math.random()*toAcc.size());
        toAcc.get(random).click();

        driver.findElement(By.id("tf_amount")).sendKeys("2000");
        driver.findElement(By.id("tf_description")).sendKeys("İyi Akşamlar...");
        driver.findElement(By.id("btn_submit")).click();
        driver.findElement(By.id("btn_submit")).click();

        WebElement yazi=driver.findElement(By.xpath("//div[@class='alert alert-success']"));
        String sonyazi=yazi.getText();
        System.out.println(sonyazi);

        Assert.assertEquals("Testiniz Hatalıdır...",sonyazi,"You successfully submitted your transaction.");



        Thread.sleep(2000);
        driver.quit();

    }

    public static void signIn(String isim,String sifre){
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        WebElement user=driver.findElement(By.id("user_login"));
        user.sendKeys(isim);

        WebElement pswrd=driver.findElement(By.id("user_password"));
        pswrd.sendKeys(sifre);

        driver.findElement(By.name("submit")).click();
        



    }

}
