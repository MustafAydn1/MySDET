package M1W3D4_G14_WindowsHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class _1_OpenWindows$target_blank extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.selenium.dev/");
        String strMi=driver.getWindowHandle(); // tek bıtane alırsam String mi?? Evet String dir.
        System.out.println("Ana sayfanın id si= "+ strMi);

        // Sayfada yeni pencere açan linkleri bulmak için target=_blank attribute olan a (link) tagleri bulundu.
        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link: linkler) {

            link.click();
        }



        // driverdan bu açılan yeni pencerelerin id leri alındı.Bu idlerin driver.getWindowHandles() ile
        // alıyoruz. üretin idler Set<String> olarak döndüğünden bu tür bir değişkene aldık.
        //Bu kısımda ana sayfanın da id sini aldı...
        //driver.getWindowHandles() ın sonucu daima Set<String> olur.

        Set<String> windows_ids= driver.getWindowHandles();


        for(String id: windows_ids){
            System.out.println(id);
        }

        System.out.println(driver.getWindowHandle());
       // driver.switchTo().window("CDwindow-07F4F9BA46D9AC7ADC2A26C6F00FE5BB");
        // --bu kullanılamaz,cunku herseferinde farklı ID vriyor.

        Thread.sleep(5000);
      //  driver.switchTo().window(strMi); // zaten ana sayfadasın...
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        driver.findElement(By.xpath("//div[@class='download-button grid']")).click();


      //  driver.findElement(By.xpath("button[aria-label='Close']")).click();//
       // driver.findElement(By.xpath("(//a[text()='Donate'])[1]")).click();
      //  driver.findElement(By.xpath("(//a[@ng-bind='faq.question'])[1]")).click();
       // driver.findElement(By.cssSelector("#first_name")).sendKeys("Ali");
//tek kelime varsa tırnaksız da çalışır.css de.. Ama birden çok kelime varsa tırnaklar şart... xpath de de bak...

    }
}
// id ler bunlar herseferinde ve herkesde farklı cıkabilir.