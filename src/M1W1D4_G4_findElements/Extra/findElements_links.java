package M1W1D4_G4_findElements.Extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseStaticDriver.driver;

public class findElements_links {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.practiceselenium.com/");

// DEFALARCA DENEDİM a TAGI DIŞINDA LinkTextler bulmuyor. TABİİ BULMAZ ADI USTUNDE Link in Text i.....



      //  WebElement l=driver.findElement(By.linkText("It's the gift that keeps on giving all year long."));//NEDEN OLMADI???

        WebElement p=driver.findElement(By.partialLinkText("seleniumframe"));
       System.out.println(p.getAttribute("target"));
        System.out.println(p.getAttribute("href"));
        System.out.println(p.getText());
        System.out.println("class= "+p.getAttribute("class"));
        System.out.println("id ="+p.getAttribute("id"));



        WebElement l=driver.findElement(By.linkText("See Collection"));
        System.out.println(l.getAttribute("style"));

        System.out.println(l.getCssValue("style"));// spandakileri vermiyor... a dakileri veriyor

        System.out.println(l.getAttribute("href"));
        System.out.println(l.getAttribute("class")); //spanın nın değil,a nın classını verdi
// burada span nin içindeki style göstermedi ama hatasını vermedi... Neden??*

// See Collection spanın içindeyken neden a nın classını veriyor.spanın classını vermiyor.
// See Collection a dan spana inip yazılınca  span içini veriyor. bU normal...

        System.out.println("************ span *************");

        l=driver.findElement(By.xpath("//span[text()='See Collection']"));

        System.out.println(l.getAttribute("href"));
        System.out.println(l.getAttribute("class"));
        System.out.println(l.getAttribute("style"));





        Thread.sleep(1000);

        driver.quit();
    }
}
