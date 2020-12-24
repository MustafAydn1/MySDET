package M1W3D3_G13_WaitingAndIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseStaticDriver;

public class _1_explicitWait extends BaseStaticDriver {
    public static void main(String[] args) {
// herbir element için ayrı ayrı oluşturulan özel bekleme suresidir. yine bekleme üst sınırı var. çunku;
//sinir koymazsak bizim yazidigimiz kodda hata varsa hata vermeyecek oyle dusunuce sinir koymak mantikli oldu o zaman.

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


        driver.findElement(By.cssSelector("button[onclick='timedText()']")).click();

       // WebElement text=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        WebDriverWait wait= new WebDriverWait(driver,45); // sadece sure tanımlandı henuz aktif değil.
// bu waiti cok defa yıne kullanırız.

        WebElement text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
         //BU locator daki  eleman visiblity oluncaya kadar bekle...
        //implicit(genelde 30 sn.) ve ExplicitWaiting kullanıldığında ikisini de kullanır.
        System.out.println(text.getText());
    }
}
