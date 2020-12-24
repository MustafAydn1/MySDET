package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import utils.BaseStaticDriver;

public class _10_Hover extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        WebElement bank=driver.findElement(By.cssSelector("#credit2 > a"));

        Actions builder=new Actions(driver);
        Action build=builder.moveToElement(bank).build();

        System.out.println("üzerine mause gelmeden önceki renk: "+bank.getCssValue("color"));
        System.out.println("üzerine mause gelmeden önceki background: "+bank.getCssValue("background"));

        build.perform();// Uzerine geldi. Ama tıklamadı. sadece bekliyor.

        System.out.println("üzerine geldikten sonraki renk: "+ Color.fromString(bank.getCssValue("color")).asHex());

       // System.out.println("üzerine geldikten sonraki background: "+ Color.fromString(bank.getCssValue("background")).asHex()); //bunda hata veriyor.
// ikinci kısım  styles ın içinden oldugu gibi çekiyor...


    }
}
// Actions Class neden var?
// bız sadece click ve sendKeys yapabildik. Ama