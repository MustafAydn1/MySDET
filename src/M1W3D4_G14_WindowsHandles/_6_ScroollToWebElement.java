package M1W3D4_G14_WindowsHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _6_ScroollToWebElement  extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        WebElement element=driver.findElement(By.xpath("//h4[text()='Top engineering roles come to you']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();",element);
//Yeri yukarıda belirlenen elemente kadar git.
//arguments[0]::   virgulden sonraki ilk elemana (index(0)) git. Buraya birden çok elemanda yazılabilir.
//scrollIntoView:: belirlenen element gözukene kadar git



//scroll into view = görünümüne gec demekmis

    }
}
