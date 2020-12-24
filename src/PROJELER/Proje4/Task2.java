package PROJELER.Proje4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*
     TASK 2
        - Bu siteye gidiniz.  "http://demowebshop.tricentis.com/"
        - Sağ üstteki "Log in" yazısına tıklayınız.
        - "email" ve "password" girip "log in"e tıklayınız.
        - Soldaki "categories" başlığının altındaki "Computers"a tıklayınız.
        - Soldaki yerde "Computers"ın altında "Desktops"a tıklayınız.
        - "BUILD YOUR OWN EXPENSIVE COMPUTER" yazan bilgisayarın altındaki "Add to cart" buttonuna tıklayınız.
        - Processor kısmında Fast'i seçin.
        - Ram kısmından 8GB'yi seçin.
        - HDD kısmından 400 GB'yi seçin.
        - Software kısmından Other Office Suite'i seçinç
        - Add to Cart buttonuna tıklayınız.
        - En yukarıdan Shopping Cart'a tıklayınız.
        - I agree with the terms checkbox'una tıklayınız.
        - Checkout buttonuna tıklayınız.
        - Billing Address formunu doldurun.
        - Formu doldurduktan sonra Continue buttonuna tıklayınız.
        - Shipping Address penceresindeki Continue Buttonuna tıklayınız.
        - Shipping Method penceresindeki Continue Buttonuna tıklayınız.
        - Cash On Delivery'yi seçip Continue buttonuna tıklayınız.
        - Payment Information penceresindeki Continue Buttonuna tıklayınız.
        - Confirm Order penceresindeki Continue Buttonuna tıklayınız.
        - Ekranda yazan mesajı doğrulayınız.
 */
public class Task2 extends BaseStaticDriver {
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

        WebElement computers = driver.findElement(By.xpath("(//a[@href='/computers'])[3]"));
        computers.click();

        WebElement desktops = driver.findElement(By.xpath("(//a[@href='/desktops'])[3]"));
        desktops.click();

        WebElement addToCard = driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[3]"));
        addToCard.click();

        WebElement fast = driver.findElement(By.xpath("//input[@id='product_attribute_74_5_26_82']"));
        fast.click();

        WebElement ram = driver.findElement(By.xpath("//input[@id='product_attribute_74_6_27_85']"));
        ram.click();

        WebElement hdd = driver.findElement(By.xpath("//input[@id='product_attribute_74_3_28_87']"));
        hdd.click();

        WebElement software = driver.findElement(By.xpath("//input[@id='product_attribute_74_8_29_90']"));
        software.click();







    }


}
