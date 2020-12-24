package M1W1D4_G4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class elemaniBulamazsa_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); // consola yazılan gereksiz bilgileri sessize aldı.

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");

        try {
            WebElement e = driver.findElement(By.id("elemanı bulamazsa ne olur.mesajını yazdır."));
            System.out.println(e.getText());
        }
        catch(Exception ex)
        {
            System.out.println("eleman bulunamadı "+ex.getMessage());
        }
        Thread.sleep(1000);

        driver.quit();






//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:  yazısı cıkar..
    }
}