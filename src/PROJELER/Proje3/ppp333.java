package PROJELER.Proje3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;
import java.util.Set;

public class ppp333 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://app.hubspot.com/login"); // siteyi açtım //

        String anaSayfaIDsi = driver.getWindowHandle();
        System.out.println("Ana Sayfa ID = " + anaSayfaIDsi);

        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("denizaydin1029@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Aydinmustafa4620..");
        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(500);

        // Sales BOLUMU
        WebElement salesButton = driver.findElement(By.xpath("(//a[@class='primary-link'])[5]"));
        salesButton.click();

        Thread.sleep(500);

        // Deals BOLUMU
        WebElement dealsButton = driver.findElement(By.cssSelector("a#nav-secondary-deals"));
        dealsButton.click();

        Thread.sleep(500);

        //refresh yaptık
        driver.navigate().refresh(); // sayfayı yeniledik.

        Thread.sleep(500);

        // Create Deal BOLUMU
        WebElement createDeal = driver.findElement(By.xpath("//span[text()='Create deal']"));
        createDeal.click();

        // Deal name BOLUMU
        WebElement dealName = driver.findElement(By.cssSelector("input#UIFormControl-19"));
        dealName.sendKeys("Salih");

        // Sales Pipeline BOLUMU
        WebElement salespipeline = driver.findElement(By.xpath("(//span[@class='uiDropdown__buttonCaret private-dropdown__caret private-dropdown__caret--form'])[3]"));
        salespipeline.click();

        Thread.sleep(500);

        //ID LERİ BULDUK. 2.WEBSAYFASINA GEÇTİK.
        Set<String> windowIdler = driver.getWindowHandles();

        for (String ID: windowIdler) {

            if (ID.equals(anaSayfaIDsi)) continue;

            System.out.println(ID);

            driver.switchTo().window(ID);
        }

        // 2.WEB SAYFASININ URL Sİ BURADA ALINDI.
        String url = driver.getCurrentUrl();

        // URL LER ASERT İLE KONTROL EDİLDİ.
        Assert.assertEquals("https://app.hubspot.com/pricing/8445706/sales?upgradeSource=deals-create-deal-general-create-deal-multiple-pipelines-pql-feature-lock&term=annual&edition=starter",url);

        Thread.sleep(1000);

        // 2.WEB SAYFASI KAPATILDI
        driver.close();

        // ANA SAYFAYA GEÇİLDİ.
        driver.switchTo().window(anaSayfaIDsi);

        // DEAL STAGE DROPDOWN BÖLÜMÜ
        WebElement dealStage1 = driver.findElement(By.xpath("//span[text()='Appointment scheduled']"));
        dealStage1.click();

        // RANDOM SEÇTİRDİK.
        List<WebElement> dealStage = driver.findElements(By.cssSelector("ul.private-typeahead-results>li")); //7 tane eleman var.

        int randomSayi = (int) (Math.random() * 6);
        dealStage.get(randomSayi).click();

        //  Deal Type DROPDOWN BÖLÜMÜ
        WebElement  dealtype1 = driver.findElement(By.xpath("(//span[@class='private-dropdown__button-label uiDropdown__buttonLabel'])[11]"));
        dealtype1.click();

        // RANDOM SEÇTİRDİK.
        List<WebElement> dealtype = driver.findElements(By.cssSelector("div.Select-menu-outer>div>div")); //3 tane var 1.si boş

        int randomSayi2 = (int) (Math.random() * 2) + 1;
        dealtype.get(randomSayi2).click();

        Thread.sleep(1000);

        //  create BÖLÜMÜ
        WebElement  create = driver.findElement(By.xpath("//span[@class='private-loading-button__content private-button--internal-spacing']"));
        create.click();

        Thread.sleep(20000);

        //  KALEM BÖLÜMÜ
        WebElement  kalem = driver.findElement(By.xpath("(//span[@class='UIIcon__IconContent-sc-1ngbkfp-0 bVjkIp'])[1]"));
        kalem.click();

        Thread.sleep(4000);

        //  NAME BÖLÜMÜ
        driver.findElement(By.cssSelector("input[id^='UIFormControl-']")).clear();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[id^='UIFormControl-']")).sendKeys("Fatih");

        Thread.sleep(1000);

        //  SAVE BÖLÜMÜ
        WebElement  save = driver.findElement(By.xpath("//i18n-string[text()='Save']"));
        save.click();

        Thread.sleep(1000);

        //  NAME DEĞİŞİKLİĞİ DOĞRULAMA
        WebElement  fatih = driver.findElement(By.xpath("//span[text()='Fatih']"));
        Assert.assertEquals("Fatih", fatih.getText());

        //  Actions BÖLÜMÜ
        WebElement  actions = driver.findElement(By.xpath("//span[text()='Actions']"));
        actions.click();

        Thread.sleep(1000);

        //  Delete BÖLÜMÜ
        WebElement  delete = driver.findElement(By.xpath("//i18n-string[text()='Delete']"));
        delete.click();

        Thread.sleep(1000);

        //  Delete Deal BÖLÜMÜ
        WebElement  deleteDeal = driver.findElement(By.xpath("//i18n-string[text()='Delete deal']"));
        deleteDeal.click();

        System.out.println("Test başarılı...");
        Thread.sleep(5000);
        //   driver.quit();
    }
}
