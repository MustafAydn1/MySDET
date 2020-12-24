package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _6_ActionDragAndDrop3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebElement KrediButton=driver.findElement(By.id("credit1"));

        WebElement account=driver.findElement(By.id("loan"));
        Actions builderr= new Actions(driver);

/* 1. yöntem
        Action aksiyonn=builderr.dragAndDrop(KrediButton,account).build();
        Thread.sleep(2000);
        aksiyonn.perform();

 */  //  2. Yöntem: Bu ögrenilmesede olur. 1. yöntemle aynı işi göruyor.Kafayı karıştırma. Ama BUNUN VARLIĞINI DA BİL.

        Action gezdir=builderr.clickAndHold(KrediButton).moveToElement(account).release().build();
        gezdir.perform();




    }
}
