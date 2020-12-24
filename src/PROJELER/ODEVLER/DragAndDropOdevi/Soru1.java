package PROJELER.ODEVLER.DragAndDropOdevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.List;

/*
Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html  buradaki ülke ve
// şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

 */
public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        driver.manage().window().maximize();

        List<WebElement> sehir=driver.findElements(By.cssSelector("div#answerDiv>div"));

        List<WebElement> ulke=driver.findElements(By.cssSelector("div.destinationBox"));


        for (int i = 0; i <sehir.size() ; i++) {


            for (int j = 0; j <ulke.size() ; j++) {


                Actions builder=new Actions(driver);

                Action build=builder.clickAndHold(sehir.get(i)).build();
                build.perform();
                Thread.sleep(1000);

                build=builder.moveToElement(ulke.get(j)).release().build();
                build.perform();
                String  ccsV=ulke.get(i).getCssValue("background-color");

                if(ccsV.equals("red")) continue;

            }

        }

/*

                    Action aksiyon=builder.dragAndDrop(sehir.get(i),ulke.get(j)).build();
                aksiyon.perform();
                String  ccsV=sehir.get(i).getCssValue("background-color");

                if(ccsV.equals("red"))
 */
















  WebElement madrid=driver.findElement(By.cssSelector("#a6"));
  WebElement spain=driver.findElement(By.cssSelector("#q6+div"));

Actions builder= new Actions(driver);

        Action build=builder.clickAndHold(madrid).build();
        build.perform();
        Thread.sleep(1000);

        build=builder.moveToElement(spain).release().build();
        build.perform();








  /*
        Actions builder=new Actions(driver);

        Action gezdir=builder.clickAndHold(madrid).moveToElement(spain).release().build();
        gezdir.perform();


   */



    }
}
