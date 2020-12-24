package PROJELER.Proje4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.Set;

/*
     İlk olarak manuel olarak bir hesap oluşturmalısınız. Bu linkle ulaşabilirsiniz. "http://demowebshop.tricentis.com/register"

             TASK 1
             - Bu siteye gidiniz.  "http://demowebshop.tricentis.com/"
             - Sağ üstteki "Log in" yazısına tıklayınız.
             - "email" ve "password" girip "log in"e tıklayınız.
             - Sayfanın en altındaki "Follow Us" başlığındaki "Facebook" buttonuna tıklayınız.
             Sonrasında açılan pencerenin URL'indeki "facebook" kelimesini doğrulayınız.
             - Ana sayfaya geri dönün.
             - "Information" başlığı altındaki "Contact Us" buttonuna tıklayınız.
             - "Enquiry" yazan yerin altındaki text kutusuna mesajınızı yazıp "submit" butonuna tıklayınız.
             - Sonrasında çıkan yazıyı dpğrulayınız.

 */
public class Task1  extends BaseStaticDriver {

    public static void main(String[] args) {


        driver.get("http://demowebshop.tricentis.com/");

        WebElement loginButton=driver.findElement(By.linkText("Log in"));
        loginButton.click();

        WebElement emailInput=driver.findElement(By.id("Email"));
        emailInput.sendKeys("technostudy_grup6@gmail.com");

        WebElement passwordInput=driver.findElement(By.id("Password"));
        passwordInput.sendKeys("123456");

        WebElement login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login.click();

        driver.findElement(By.cssSelector("div.listbox>ul>li+li")).click();
/*
        String anaSayfaId=driver.getWindowHandle();

        WebElement facebook=driver.findElement(By.linkText("Facebook"));
        facebook.click();

        Set<String> windowsIdler=driver.getWindowHandles();
        for (String id : windowsIdler) {
            if(id.equals(anaSayfaId)) continue;
            driver.switchTo().window(id);
        }
        String facebookUrl=driver.getCurrentUrl();
        Assert.assertTrue(facebookUrl.toLowerCase().contains("facebook"));

        driver.switchTo().window(anaSayfaId);


 */
}
}