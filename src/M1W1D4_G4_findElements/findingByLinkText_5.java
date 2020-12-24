package M1W1D4_G4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class findingByLinkText_5 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {



        driver.get("http://www.practiceselenium.com/");

        WebElement l=driver.findElement(By.linkText("Check Out"));//Sadece a nın içinde arayacagız...Başka yerde değil..
        System.out.println(l.getAttribute("data-url")); // buraya hangi attrıbute yi yazarsan onun = karşılıgı console cıkar

//Text i Check Out olan  yerdeki(a tagındaki) data-url (keyinin) adlı attribute nin degerini yazdır.


        Thread.sleep(1000);

        driver.quit();



    }

}
