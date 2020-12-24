package M1W2D3_G9_GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _3_displayed extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.facebook.com/ ");
        // driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        // yeni hesaba tıkladı
        driver.findElement(By.cssSelector("a[id^='u'][id$='_2']")).click();

        Thread.sleep(5000);

        WebElement email=driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']")); // ilk mail
        WebElement tEmail=driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']")); // ikinci mail


        System.out.println(tEmail.isDisplayed());            // 2. mail ekranda görunuyor mu --->> false

        email.sendKeys("ismet@hotmail.com");// 1. maile girdim.
        Thread.sleep(5000);
        System.out.println(tEmail.isDisplayed());           // şimdi 2. mail görunuyor mu --->> true
        tEmail.sendKeys("ismet@hotmail.com");// 2. mail görundü. bilgi girdim.


        Thread.sleep(6000);
       // driver.quit();
    }
/*BURADA NE YAPTIK BİZ:::
İLK email girmeden ikinci email sayfası açılmıyor, facebook sayfasında...
Bunun dogru işleyip işlemediğine baktık...


 */

    }

