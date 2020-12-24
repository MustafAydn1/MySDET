package PROJELER.ODEVLER.DragAndDropOdevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class frk1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        List<WebElement> ulkeler=driver.findElements(By.cssSelector("div.destinationBox"));
        List<WebElement> sehirler=driver.findElements(By.cssSelector("#answerDiv>div.dragDropSmallBox"));//div[id='answerDiv']>div
        Actions builder=new Actions(driver);

        WebElement ulk = driver.findElement(By.cssSelector("#answerDiv>div.dragDropSmallBox"));

        for (int i = 0; i <sehirler.size(); i++) {
            WebElement shr=sehirler.get(i);
            Thread.sleep(1000);
            for (int j = 1; j < ulkeler.size()+1; j++) {
                String asd="div.destinationBox:nth-of-type("+j*2+")";
                ulk= driver.findElement(By.cssSelector(asd));
                Action build=builder.clickAndHold(shr).build();
                build.perform();
                Thread.sleep(1000);

                build=builder.moveToElement(ulk).release().build();
                build.perform();
                System.out.println(shr.getCssValue("background-color"));
                if(shr.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) break;
                Thread.sleep(2000);




            }


        }
    }
}
