package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _2_ActionDoubleClick extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();


        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));

        Actions builder=new Actions(driver);

        Action build=builder.moveToElement(doubleClickButton).doubleClick().build();//Aynı build değil

        Thread.sleep(2000);
        build.perform();

        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

        Thread.sleep(35000);
        driver.quit();



    }
}
