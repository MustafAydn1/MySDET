package M1W2D3_G8_Select_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;
/*
   Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.
   3- Formdaki tüm bilgileri giriniz.
*/
public class _5_FacebookSelect extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.facebook.com/ ");
       // driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[id^='u'][id$='_2']")).click();

        Thread.sleep(1000);

        WebElement isim1=driver.findElement(By.cssSelector("div._5dbb>input[id^='u'][id$='b']"));
        isim1.sendKeys("Mustafa");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Aydın");
        Thread.sleep(1000);

        driver.findElement(By.name("reg_email__")).sendKeys("05321111111");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("1qaz.xsw2.");

        WebElement gun=driver.findElement(By.name("birthday_day"));
        Select sayi= new Select(gun);
        sayi.selectByIndex(0);
        Thread.sleep(1000);

        Select months=new Select(driver.findElement(By.name("birthday_month")));
        months.selectByVisibleText("Şub");
        Thread.sleep(1000);

        Select year=new Select(driver.findElement(By.name("birthday_year")));
        year.selectByVisibleText("1980");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[value='2']")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("websubmit")).click();















        //Thread.sleep(600000);

    }
}
