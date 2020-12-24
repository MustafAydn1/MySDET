package M1W1D4_G4_findElements.Extra;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseStaticDriver.driver;

public class findElements {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.practiceselenium.com/");



        WebElement i=driver.findElement(By.id("wsb-button-00000000-0000-0000-0000-000450914899"));
        System.out.println(i.getAttribute("href"));

        WebElement c=driver.findElement(By.className("editor_sidebarmore"));
        System.out.println(c.getText());

        WebElement l=driver.findElement(By.linkText("It's the gift that keeps on giving all year long."));
        System.out.println(l.getAttribute("class"));


        Thread.sleep(1000);

        driver.quit();
    }
}
