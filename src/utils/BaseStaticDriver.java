package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.concurrent.TimeUnit;
/*
      Selenium Bekletme Konusu:
      Thread.sleep : bu selenium a özel değil, java ya ait yazılımın herhangi bir yerinde verilen süre kadar bekler.

       Implicit wait :
       Tüm sayfadaki elemanalr için bir keleme süresi atanıyor.Ancak eleman bulunduğu anda daha fazla beklemiyor.
       Bütüm elemanlar geçerli.NoSuchElement hatası nı vermek için verilen süre kadar  eleman bulunana kadar bekler.

                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES)

       pageLoadTimeout :
       driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS)
       30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.
       driver.get() de  driver.navigate.To
 */
public class BaseStaticDriver {

    public  static WebDriver driver;

    // direk bu class çağrıldığı anda canlı olması için static blok içine alındı
    static {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); // consola yazılan gereksiz bilgileri sessize aldı.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //sadece anasayfa(ilk) yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // bütün elemanlar için geçerli
    }






}
