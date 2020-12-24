package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _8_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/auto-complete");
        driver.manage().window().maximize();

        WebElement textInput=driver.findElement(By.cssSelector("div[class='auto-complete__value-container css-1hwfws3']"));

        Actions builder=new Actions(driver);

        Action yaz=builder.moveToElement(textInput).click().keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("hmet").build();

        Thread.sleep(2000);
        yaz.perform();
/* Biz Nasıl Yazıyorsak; BİLGİSAYARDA ÖYLECE YAZDI...

inputa gidildi.--> içine tıklandı.-->büyük harf için önce SHIFT tuşuna basıldı.-->>
 a tuşuna basığımızda shift basılı olduğundan büyük yazdı-->>
büyük harf için bastığımız tuş kontrolünü geri aldık-->> kalanını küçük harf yazdı.
 */



    }
}
