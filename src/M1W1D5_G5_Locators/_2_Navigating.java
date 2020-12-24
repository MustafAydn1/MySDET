package M1W1D5_G5_Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseStaticDriver.driver;

public class _2_Navigating {
    public static void main(String[] args) throws InterruptedException {


        driver.navigate().to("http://www.practiceselenium.com/"); // siteyi açtım.
        // ileri geri için illa ki navigate().to ile açmaya gerek yok. get ilede açılsa calışr

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

// for döngusune al. 1000 kez yaptır.

    }
}
