package PROJELER.Proje2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.List;

/*
1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın. Sign in button'una tıklayınız.

3) Paybils button'ına tıklayınız.

4) Purchase Foreign Currency'ya tıklayınız.

5) Currency kısmından rastgele(RANDOM) bir değer seçiniz. (Dropdown'ın içindeki Select One değerini, Random'a dahil etmeyin.)

6) Amount'a bir değer girin.

7) U.S. dollar (USD)'ı seçiniz.

8) Purchase button'una tıklayınız.

9) Foreign currency cash was successfully purchased. yazısı görünmelidir.
 */
public class _3_ extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        signIn("username", "password");

        driver.findElement(By.linkText("Pay Bills")).click();
/*
  //div[text()='Sauce Labs Backpack']/parent::a     (parentin_adı)  ile bir  üste cıkma.
  //div[text()='Sauce Labs Backpack']/parent::*         --->> bi ustte kim varsa oraya çık.parentin adını yazmadan

  //div[text()='Sauce Labs Backpack']/parent::a/parent::div  --->> iki üste cıkmak için.İsimleriyle birlikte.
 //div[text()='Sauce Labs Backpack']/../../../..             --->> 4 kez uste cıktı... (/..) ile
 */
//div[text()='Sauce Labs Backpack']/parent::*/parent::*   --->> iki üste cıkmak için.

        driver.findElement(By.xpath("//a[@href='#ui-tabs-3']/parent::li")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("pc_currency")).click();

       // List<WebElement> doviz=driver.findElements(By.xpath("//select[@id='pc_currency']/*"));

        Thread.sleep(1000);
        WebElement dovizzz=driver.findElement(By.id("pc_currency"));
        Select aa= new Select(dovizzz);
        int sa=(int)(Math.random()*15);
        //String  zz=String.valueOf(sa);
        aa.selectByIndex(sa);

        driver.findElement(By.id("pc_amount")).sendKeys("3500");
        driver.findElement(By.id("pc_inDollars_true")).click();
        driver.findElement(By.id("purchase_cash")).click();

        WebElement son=driver.findElement(By.xpath("//div[@id='alert_content']"));
        String sonYazi=son.getText();

        Assert.assertEquals("Hata Var...",sonYazi,"Foreign currency cash was successfully purchased.");

        String url=driver.getCurrentUrl();
        System.out.println(url);









Thread.sleep(6000);
//driver.quit();

    }
    public static void signIn(String isim, String sifre) {
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        WebElement user = driver.findElement(By.id("user_login"));
        user.sendKeys(isim);

        WebElement pswrd = driver.findElement(By.id("user_password"));
        pswrd.sendKeys(sifre);

        driver.findElement(By.name("submit")).click();
    }

}
