package PROJELER.Proje2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

/*
1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html

2) Login'e "username" -- Password'a "password" yazın. Sign in button'una tıklayınız.

3) Paybils button'ına tıklayınız.

4) Payee dropdown'unundan rastgele (Random) bir değer seçiniz.

5) Account dropdown'unundan rastgele (Random) bir değer seçiniz..

6) Amount'a bir değer girin..

7) Date'de bir tarih seçiniz.

8) Description'ı her hangi bir şekilde doldurun.

11) Pay button'una tıklayınız.

12) The payment was successfully submitted. mesajının göründüğünü doğrulayınız.
 */
public class _2_ extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        signIn("username", "password");

        driver.findElement(By.linkText("Pay Bills")).click();

        driver.findElement(By.id("sp_payee")).click();

        List<WebElement> payee=driver.findElements(By.xpath("//select[@id='sp_payee']/option"));
        int aa=(int)(Math.random()*payee.size());
        payee.get(aa).click();


        driver.findElement(By.id("sp_account")).click();

        List <WebElement> acc=driver.findElements(By.xpath("//select[@id='sp_account']/option"));
        int bb=(int)(Math.random()*acc.size());
        acc.get(bb).click();

        driver.findElement(By.id("sp_amount")).sendKeys("3000");

        driver.findElement(By.id("sp_date")).sendKeys("2020-09-16");

        driver.findElement(By.id("sp_description")).sendKeys("Rabbim Bankaya düşürmesin...");

        driver.findElement(By.id("pay_saved_payees")).click();

        WebElement yazi=driver.findElement(By.xpath("//div[@id='alert_content']"));
        String  sonyazi=yazi.getText();
        System.out.println(sonyazi);

        Assert.assertEquals("hatalı",sonyazi,"The payment was successfully submitted.");




Thread.sleep(6000);
driver.quit();

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
