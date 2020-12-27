package M1W1D4_G4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class findingByClassName_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consola yazılan gereksiz bilgileri sessize aldı.

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.practiceselenium.com/");

        WebElement c=driver.findElement(By.className("editor_collections"));
        System.out.println(c.getText());

        driver.manage().window().maximize();



        Thread.sleep(1000);

        driver.quit();

    }
}
