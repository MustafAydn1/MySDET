package PROJELER.Proje1.Part3;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class ReadMe extends BaseStaticDriver {

    /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        4) Snepdeal logosuna tıklayınız.

        5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

     */

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement arama=driver.findElement(By.id("inputValEnter"));
        arama.sendKeys("teddy bear");

        WebElement buton=driver.findElement(By.className("searchTextSpan"));
        buton.click();

       WebElement sonuc=driver.findElement(By.className("marT12"));
     String aa=sonuc.getText();

      Assert.assertEquals("We've got 1499 results for 'teddy bear'",aa);

        WebElement sonuc2=driver.findElement(By.className("notIeLogoHeader"));
        sonuc2.click();

        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/", url);

        driver.quit();


    }



}
