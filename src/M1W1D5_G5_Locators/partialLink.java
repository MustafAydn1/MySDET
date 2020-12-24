package M1W1D5_G5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseStaticDriver.driver;

public class partialLink {
    public static void main(String[] args) throws InterruptedException {

    driver.get("http://www.practiceselenium.com/");

    WebElement p=driver.findElement(By.partialLinkText(" Passion"));//Linktest leri a nın içinde arayacagız...
        System.out.println(p.getAttribute("href")); // buraya hangi attrıbute yi yazarsan onun = karşılıgı console cıkar



        Thread.sleep(1000);

        driver.quit();
}

}