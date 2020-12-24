package PROJELER.ODEVLER.DragAndDropOdevi;

import utils.BaseStaticDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class hlk2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

/*TODO
            Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
            buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
*/

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> studentList = driver.findElements(By.cssSelector("ul#allItems>li"));

        List<WebElement> teamList = driver.findElements(By.cssSelector("div#dhtmlgoodies_mainContainer>div"));

        Actions actions = new Actions(driver);
        Action action;


        Thread.sleep(1000);

        for (WebElement student: studentList){

            for (WebElement team: teamList) {

                action = actions.clickAndHold(student).moveToElement(team).release(team).build();
                action.perform();

                if (team.getText().contains(student.getText())) break; // bunu incele diğerlerinden farklı
            }
        }

        System.out.println("Test başarılı...");

        Thread.sleep(2000);
       // driver.quit();

    }
}
