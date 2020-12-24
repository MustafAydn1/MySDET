package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _7_DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        driver.manage().window().maximize();

        WebElement slider=driver.findElement(By.cssSelector("div>span+span")); //slider:: kaydırıcı
//kAYDIRACAĞIN kutucugu bul.kodunu yaz.

        Actions builder=new Actions(driver);

        Action aksiyon=builder.dragAndDropBy(slider,-150,0).build(); //offset:: Dengelemek
        Thread.sleep(2000);
        aksiyon.perform();

    }
}
