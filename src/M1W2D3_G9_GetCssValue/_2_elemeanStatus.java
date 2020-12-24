package M1W2D3_G9_GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*
boolean isSelected();   checkbox, radiobutton
boolean isEnabled();
boolean isDisplayed();

isEnabled
Monday -> true
Sunday -> false

isSelected();
Tuesday -> true
Thursday -> false


isDisplayed();
Monday -> true
Sunday -> true


Bu sayfayı daha iyi anlamak için yerinde denemeler yap... site de...
 */
public class _2_elemeanStatus extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        // driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());
        System.out.println(sali.isEnabled());
        System.out.println(sali.isSelected());
        Thread.sleep(2000);

        sali.click();
        System.out.println(sali.isSelected());
        System.out.println("***************************************************************");

        WebElement sunday=driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));
        System.out.println(sunday.isDisplayed());
        System.out.println(sunday.isEnabled());
        System.out.println(sunday.isSelected());

        sunday.click();
        System.out.println(sunday.isEnabled());





    }
}
