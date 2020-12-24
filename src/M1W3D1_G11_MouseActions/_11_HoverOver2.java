package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import javax.swing.*;

public class _11_HoverOver2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.manage().window().maximize(); // bunlar yukarı da yazılabilir.
        driver.manage().deleteAllCookies();

        driver.get("https://www.etsy.com/");

        Thread.sleep(2000);

        WebElement clothingMenu=driver.findElement(By.id("catnav-primary-link-10923"));
        WebElement kidsMenu=driver.findElement(By.id("side-nav-category-link-10941"));

        Actions builder=new Actions(driver);

        Action build=builder.moveToElement(clothingMenu).build();//sadece uzerine geldi.ama tıklamadı.Hover ile yeni ekran gösterdi.
        build.perform();

        Thread.sleep(3000);

        build=builder.moveToElement(kidsMenu).build();
        build.perform();





    }
}
//driver.findElement(By.cssSelector("button[class='wt-btn wt-btn--secondary wt-width-full']")).click(); bunu da yaz bak bakalım