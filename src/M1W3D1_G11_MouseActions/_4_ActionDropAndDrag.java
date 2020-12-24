package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _4_ActionDropAndDrag extends BaseStaticDriver {
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


        WebElement Rome=driver.findElement(By.id("box6"));
        WebElement Italy=driver.findElement(By.id("box106"));

        Actions builderr= new Actions(driver); // inşaa et, yap

        Action aksiyonn=builder.dragAndDrop(Rome,Italy).build();
        Thread.sleep(2000);
        aksiyonn.perform();


        WebElement Washington=driver.findElement(By.id("box3")); // source
        WebElement Sweden=driver.findElement(By.id("box102"));

        Actions builder2=new Actions(driver);

        Action tasi=builder2.dragAndDrop(Washington,Sweden).build();
        Thread.sleep(2000);
        tasi.perform();






    }
}
