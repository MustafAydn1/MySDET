package M1W1D4_G4_findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningWebSitesi_1 {
    public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");// hangi browserı kullanacağımı ve tarayıcının(browserin) path ini verdim.

   WebDriver driver=new ChromeDriver();// çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.

        driver.get("http://www.practiceselenium.com/"); // siteyi açtım

        driver.manage().window().fullscreen();

        Thread.sleep(1000);

        driver.quit();




    }
}
