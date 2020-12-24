package PROJELER.ODEVLER.DragAndDropOdevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.List;

/*
Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.@Student
 */
public class Soru2  extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        List<WebElement> ogrenci=driver.findElements(By.cssSelector("allItems")); // source


        //List<WebElement> ogr=driver.findElements(By.tagName("li"));
       int a=0;
        ArrayList<String>aa=new ArrayList<>();
        for(WebElement ee:ogrenci){
            aa.add(ogrenci.get(a).getAttribute("id"));
            a++;
        }


       // WebElement sinifa=driver.findElement(By.id("box1")); //target

        for (int i = 0; i <ogrenci.size() ; i++) {

           // aa.add(ogrenci.get(i).getAttribute("id"));
            WebElement zz=driver.findElement(By.id("aa.get(i)"));
            WebElement sinifa=driver.findElement(By.id("box1"));

            Actions builder=new Actions(driver);
            Action aksiyon= builder.dragAndDrop(zz,sinifa).build();
            aksiyon.perform();



          //  builder.dragAndDrop(driver.findElement(By.id(aa.add(ogrenci.get(i).getAttribute("id"))),sinifa)



        }












/*
        for (WebElement students:ogrenci) {

            Actions builder= new Actions(driver);

            builder.dragAndDrop(students,sinifa).perform();

        }


 */
    }
}
