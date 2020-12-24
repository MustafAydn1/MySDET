package M1W1D1_G1_SeleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

      WebDriver driver= new ChromeDriver();

      driver.get("https://www.google.com.tr/");

/*BURADA YAOILAN İŞLEM NEDİR? BU MUDUR?

Yerelde başlatılan sanal bir browser üzerinde programdan gelen komutları direkt olarak browserın motorundan çalıştıran bir interface.

WebDriverda test yapılacak tarayıcı WebDriver interface ailesinden bir object olarak türetilir. --->WebDriver driver= new ChromeDriver();

 Selenium komutları bu interface’e ait methodlar sayesinde tarayıcıya ulaşır.

 */

    }
}
