package M1W3D1_G11_MouseActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

public class _5_ActionDropAndDrag2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebElement bank=driver.findElement(By.xpath(" //a[text()=' BANK '] ")); //source

        //WebElement account=driver.findElement(By.cssSelector("#shoppingCart1>h3")); // bu yanlılş oldu. incele
        // çunku Account yazısını almışım, altındaki kutucugu alacakken....

        WebElement account=driver.findElement(By.id("bank")); // target
        Actions builderr= new Actions(driver); // inşaa et, yap

        Action aksiyonn=builderr.dragAndDrop(bank,account).build();
        Thread.sleep(2000);
        aksiyonn.perform();

      WebElement kutuicerigi =driver.findElement(By.cssSelector("#bank>li"));
        System.out.println(kutuicerigi.getText());

        Assert.assertTrue("Hatalı",kutuicerigi.getText().equals(bank.getText())); // bunu da öğren...



    }
}
