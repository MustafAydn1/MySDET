package M1W2D2_G7_Xpath;
/*
1- https://www.saucedemo.com/ sitesini açınız.
        2- Ekranda görünen usernamleri bir string diziye atınız.
        3- Bu username ve passwordlarını hepsinin login olup olamadığını
        login olduktan sonraki sayfada Products kelimesinin kontrol ederek
        doğrulayınız.
        diğer login kontrolleri için navigate.back kullanınız.
        4- Login olamayan userları ve hata bilgisini yazdırınız.

 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class users_Login_tryCatch_ile extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.saucedemo.com/ ");
        driver.manage().window().maximize();

        String [] kullanicilar={"standard_user","locked_out_user","problem_user","performance_glitch_user"};
        String pswrd="secret_sauce";

        for (String users:kullanicilar) {

            WebElement usernameinput=driver.findElement(By.xpath("//input[@id='user-name'] "));
            usernameinput.clear();
            usernameinput.sendKeys(users);
            Thread.sleep(1000);

            WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
            password.clear();
            password.sendKeys(pswrd);
            Thread.sleep(1000);

            driver.findElement(By.xpath("//input[@id='login-button']")).click();

        try {

             WebElement sonuc=driver.findElement(By.xpath("//div[text()='Products']"));
            System.out.println(users +" login oldu...");
            driver.navigate().back();

        }
         catch(NoSuchElementException  e)
            {
                WebElement errorElement=driver.findElement(By.xpath("//h3[@data-test='error']"));
                System.out.println(users+" "+ errorElement.getText());
            }

        Thread.sleep(2000);
    }

        Thread.sleep(3000);
        driver.quit();
    }
}

// geri dönmek için illa ki navigate ile başlamak zorunda degil....
/*

        driver.navigate().to("http://www.practiceselenium.com/"); // siteyi açtım

                Thread.sleep(2000);

                driver.manage().window().maximize();

                WebElement link=driver.findElement(By.linkText("Check Out"));

                link.click();
                Thread.sleep(3000);

                driver.navigate().back(); // geri

                Thread.sleep(3000);

                driver.navigate().forward(); // ileri

                Thread.sleep(3000);
                driver.quit();



 */
/*
  WebElement users=driver.findElement(By.xpath("//div[@id='login_credentials']"));

        List<WebElement> aa=driver.findElements(By.xpath("//div[@id='login_credentials']"));

        for(WebElement bb:aa)
        users.sendKeys(bb.getText());
 */
/*
Ömer Gökerbugün saat 22:45
List<WebElement> liste=driver.findElements(By.cssSelector("div.login_credentials"));
hocam bu sekilde alidm
ayrim var
bir alta iniyor
zaten ayri ayri aliyor
Mesut dbugün saat 22:46
\n
 */