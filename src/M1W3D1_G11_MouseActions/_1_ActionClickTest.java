package M1W3D1_G11_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

import java.util.Base64;

public class _1_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {

// drag and drop:: surukle ve bırak
//click and hold:: tıkla ve tut
//hover over:: Üzerinde gezdirmek


        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement clickButton=driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions builder=new Actions(driver); // driver üzerinden aksiyonları çalıştırmak için değişken tanımladım

        Action aksiyon=builder.moveToElement(clickButton).click().build(); // aksiyonlar değişkenine bir aksiyon ekledim.
        // Henüz işlem olmadı.
        //moveToElement:: Öğeye Taşı

        aksiyon.perform(); //Aksiyon Yapılıyor...

        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());


    }
}
