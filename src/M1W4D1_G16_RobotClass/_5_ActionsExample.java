package M1W4D1_G16_RobotClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _5_ActionsExample extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.yogaalliance.org/");

        Actions builder=new Actions(driver);
        WebElement aa=driver.findElement(By.xpath("//a[text()='Become a Member']"));


       Action aksiyon= builder.moveToElement(aa).build();
       aksiyon.perform();

       driver.findElement(By.xpath("(//a[text()='Teachers'])[2]")).click();
Thread.sleep(7000);

       String baslik="\n" + "\tTeachers | Yoga Alliance";


        Assert.assertEquals(driver.getTitle(),baslik);



    }
}
