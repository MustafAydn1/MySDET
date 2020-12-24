package PROJELER.ODEVLER.DragAndDropOdevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class Soru22 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Thread.sleep(1000);
        WebElement ogr1=driver.findElement(By.cssSelector("li[id='node1']"));
        WebElement teama=driver.findElement(By.cssSelector("ul#box1"));

        Actions builder=new Actions(driver);

        Action gezdir=builder.clickAndHold(ogr1).moveToElement(teama).release().build();
        gezdir.perform();

      //  Action aksiyon= builder.dragAndDrop(ogr1,teama).build();
        //aksiyon.perform();





    }
}
////p[text()='Team a']