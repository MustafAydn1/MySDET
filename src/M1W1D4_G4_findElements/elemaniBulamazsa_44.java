package M1W1D4_G4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class elemaniBulamazsa_44 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consola yazılan gereksiz bilgileri sessize aldı.

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        WebElement e=driver.findElement(By.id("elemanı bulamazsa ne olur"));
        System.out.println(e.getText());

        Thread.sleep(3000);

        driver.quit();

// ELEMANI BULMAZSA : Site acılır, öylece kalır...bekler.ilerleyemez.. console de hatayı bildirir.


//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element:  yazısı cıkar..


    }
}
