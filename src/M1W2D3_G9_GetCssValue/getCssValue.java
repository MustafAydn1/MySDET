package M1W2D3_G9_GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.Base64;

public class getCssValue extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

      driver.get("https://www.snapdeal.com/");
       driver.manage().window().maximize();
       Thread.sleep(1000);
        WebElement btn=driver.findElement(By.id("inputValEnter"));

        // tag in içdeki keylerin değerlerini almamızı sağlar
        System.out.println(btn.getAttribute("name"));
        System.out.println(btn.getAttribute("type"));
        System.out.println(btn.getAttribute("class"));
        System.out.println(btn.getAttribute("onkeypress"));

        System.out.println("*********************************************************************");

        // --->> Elemeanın CSS yani ekran gözüken tüm özelliklerini; font renk vs ulaşmamızı sağlar. <<---
        WebElement btnCssClassValues=driver.findElement(By.className("searchformInput"));
        System.out.println(btnCssClassValues.getCssValue("color"));
        System.out.println(btnCssClassValues.getCssValue("font-size"));
        System.out.println(btnCssClassValues.getCssValue("background"));
        System.out.println(btnCssClassValues.getCssValue("font-family"));

       // Assertlerde de  kullanılabilir. aldıgın metnın rengi kımızı mı? gibi..

    }
}
