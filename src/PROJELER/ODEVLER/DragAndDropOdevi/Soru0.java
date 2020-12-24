package PROJELER.ODEVLER.DragAndDropOdevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

public class Soru0 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        // source:: box1    target:: box101
        //  kaynak           hedef

        WebElement oslo=driver.findElement(By.id("box1"));      // SOURCE=KAYNAK
        WebElement norvay=driver.findElement(By.id("box101")); // TARGET=HEDEF

        Actions builder= new Actions(driver); // inşaa et, yap

        Action aksiyon=builder.dragAndDrop(oslo,norvay).build();  //  // drag and drop:: surukle ve bırak
        Thread.sleep(2000);
        aksiyon.perform();


        List<WebElement> sehir=driver.findElements(By.xpath("//div[@class='dragableBox']"));
        List<WebElement> ulke=driver.findElements(By.xpath("//div[@class='//div[@class='dragableBoxRight']']"));








    }
}
