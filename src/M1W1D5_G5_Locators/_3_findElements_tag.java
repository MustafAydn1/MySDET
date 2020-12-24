package M1W1D5_G5_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseStaticDriver.driver;

public class _3_findElements_tag {

    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://www.practiceselenium.com/");

        List<WebElement> liste=driver.findElements(By.tagName("li"));// tagname i yani etiketi li olan tum elemanlar.


        for (WebElement e: liste) {
            System.out.println(e.getText());
        }


        System.out.println("***************  div taglarının text leri  *************************");

        List <WebElement> divlist=driver.findElements(By.tagName("div"));

        for(WebElement divs:divlist)
            System.out.println(divs.getText());




        Thread.sleep(3000);
        driver.quit();

    }

}
