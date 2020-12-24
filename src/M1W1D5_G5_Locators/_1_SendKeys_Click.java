package M1W1D5_G5_Locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*
Test Senaryo
        1- http://www.practiceselenium.com git
        2- Check Out a tıklat---> LinkTest "Check Out"
        3- email e bilgi gir ---id::email
        4- name bilgi gir --- id::   name
        5- addres e bilgi gir---  id:: address
        6- Place Order butonuna tıklat. ---    class::: btn btn-primary
        7- Açılan sayfaya geldiği assert
        kontrol et.(yeni sayfada Menu yazısı
        var mı?)

        id--->wsb-element-00000000-0000-0000-0000-000450914921

        8-url ile bakacagız--->   http://www.practiceselenium.com/menu.html?
 */
public class _1_SendKeys_Click extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.practiceselenium.com/");
        Thread.sleep(1000);

        driver.manage().window().maximize();

        WebElement link=driver.findElement(By.linkText("Check Out"));

        link.click(); // butona tıklama

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("aydinmustafa4620@gmail.com"); //text gönderme


        WebElement name=driver.findElement(By.id("name"));
        name.sendKeys("MUSTAFA");

        WebElement adres=driver.findElement(By.id("address"));
        adres.sendKeys("İnsan olan heryer...");

        WebElement button=driver.findElement(By.className("btn-primary"));
        button.click();


        WebElement menu=driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menuText=menu.getText();

        Assert.assertEquals("Menu",menuText); // junıt test yapmak için.




        String url=driver.getCurrentUrl();
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?",url);

        Thread.sleep(6000);
        driver.quit();
    }
}
