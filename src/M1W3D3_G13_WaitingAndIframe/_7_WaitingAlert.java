package M1W3D3_G13_WaitingAndIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;
/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Çıkan alerte accept yapınız.

  wait.until(ExpectedConditions.alertIsPresent());

 */
public class _7_WaitingAlert extends BaseStaticDriver {
    public static void main(String[] args) {

driver.get("https://www.demoblaze.com/index.html");
driver.findElement(By.linkText("Samsung galaxy s6")).click();
driver.findElement(By.linkText("Add to cart")).click();

        WebDriverWait wait=new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();


// burada implicit Wait çözum olmuyor. WebElementler için gecerli... oluşmadığında noSuchElment hatası veriyor
// Oysa ki alert web element değil.. bu yuzden göremez...
//ya Thread yada explicit yapacaz.



    }
}
