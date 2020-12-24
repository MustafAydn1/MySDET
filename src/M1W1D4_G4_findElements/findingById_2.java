package M1W1D4_G4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class findingById_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consola yazılan gereksiz bilgileri sessize aldı.

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");

        driver.manage().window().maximize();

        WebElement e=driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914887"));
        System.out.println(e.getText());

// demek ki birşeyin text ini alacagımız zaman id ile de alabiliriz... BEN YANLIŞ ANLAMIŞIM...
//SORU::  Css DE  a tagı dışında text ile arama yapılamaz...Css de a tagı dışındaki  textler alınamaz mı???

// SORU:: xpath de tum tagların texleri ile arama mı yapabiliyoruz.Tum tagların textlerini alamak için mi xpath kullanıyoruz???


        Thread.sleep(3000);

        //driver.quit();

    }
}
