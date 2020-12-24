package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.nio.file.WatchEvent;

public class _9_YonTuslariSecimi extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/auto-complete");
        driver.manage().window().maximize();

        WebElement otomatikYaz=driver.findElement(By.cssSelector("div[class='auto-complete__value-container auto-complete__value-container" +
                "--is-multi css-1hwfws3']"));

        Actions builder=new Actions(driver);

        Action yaz=builder.moveToElement(otomatikYaz).click().sendKeys("b").build();
        yaz.perform();

Thread.sleep(4000); // DAHA NET GÖRELİM diye ikimparçada yaptık.

        yaz=builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();   // Arrow down= Aşağı ok
        yaz.perform();






    }
}
