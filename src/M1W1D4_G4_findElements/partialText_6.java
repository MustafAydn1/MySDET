package M1W1D4_G4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseStaticDriver.driver;


public class partialText_6 {

    public static void main(String[] args) throws InterruptedException {



        driver.get("http://www.practiceselenium.com/");

        WebElement p=driver.findElement(By.partialLinkText(" Passion"));//Linktest leri a nın içinde arayacagız...
        System.out.println(p.getAttribute("href")); // buraya hangi attrıbute yi yazarsan onun = karşılıgı console cıkar

//İçinde passion texti gecen a tagının, href adlı attribute nin degerini yazdır.

        Thread.sleep(1000);

        driver.quit();



    }
}