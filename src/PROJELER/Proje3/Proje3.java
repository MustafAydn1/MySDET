package PROJELER.Proje3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*
        Manuel bir şekilde web sitesine kayıt olun. (Kendi hesabınızı oluşturun)

        Bu siteye gidin ->  https://app.hubspot.com/login
        Email address ve Password girdikten sonra Log in buttonuna tıklayınız.

        Sales'a tıklayınız.
        Deals'a tıklayınız.

        Create Deal'a tıklayınız. (Note: Otomasyon sırasında Deal'a tıkladığınızda tablo gözükmeyebilir. Browser'ı yenileyin. (refresh) )
        Deal name giriniz.

        Sales Pipeline'a tıklayınız. (İkinci websitesinin URL'inin bu URL olduğunu doğrulayınız. -->
        https://app.hubspot.com/pricing/7766931/sales?upgradeSource=deals-create-deal-general-create-deal-multiple-pipelines-pql-feature-lock&term=annual&edition=starter )
        Deal Stage dropdown'undan rastgele bir şey seçiniz.
        Deal Type dropdown'undan rastgele bir şey seçiniz.
        Create button'a tıklayınız.

        Sol üstte, Verdiğiniz isimin yanındaki küçük kalem simgesine tklayınız.
        Deal name'i değiştiriniz.
        Save'e tıklayınız.
        Deal Name'in değiştiğini doğrulayınız.

        "Actions" button'una tıklayınız.
        Delete'e tıklayınız.
        Delete deal'a tıklayınız.

        Deal'ın artık görünmediğini doğrulayınız.
     */
public class Proje3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://app.hubspot.com/dashboard-library/8446011");


        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("denizaydin1029@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Aydinmustafa4620..");
        driver.findElement(By.id("loginBtn")).click();




      // driver.get("https://app.hubspot.com/demo-tour/8445744/reports-dashboard/leader-new-underperform?flowId=new-leader&tourId=leader-underperform-reports");


        WebElement sales = driver.findElement(By.xpath("(//a[@id='nav-primary-sales-branch'])[1]"));
        sales.click();

        System.out.println("sales");
        Thread.sleep(1000);
        //WebElement deals = driver.findElement(By.xpath("(//a[@id='nav-secondary-deals'])[1]"));
        //deals.click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a#nav-secondary-deals")).click();
        System.out.println("dales");

        Thread.sleep(1000);
        //WebElement createDeal = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        //createDeal.click();

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        System.out.println("deal");

        //WebElement dealname = driver.findElement(By.id("UIFormControl-51"));
        //dealname.sendKeys("Deal1");

        //WebElement salesPipeline = driver.findElement(By.xpath("(//span[@class='private-dropdown__button-label uiDropdown__buttonLabel'])[7]"));
        //salesPipeline.click();


        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[id^='UIFormControl'][data-selenium-test='property-input-dealname']")).sendKeys("Ali");

        String sayfaId=driver.getWindowHandle();
       driver.findElement(By.xpath("(//span[text()='Sales Pipeline'])[2]")).click();

       // Assert.assertEquals(driver.getCurrentUrl(),"https://app.hubspot.com/pricing/7766931/sales?upgradeSource=deals-create-deal-general-create-deal-multiple-pipelines-pql-feature-lock&term=annual&edition=starter )");
                                                 //   https://app.hubspot.com/pricing/8446011/sales?upgradeSource=deals-create-deal-general-create-deal-multiple-pipelines-pql-feature-lock&term=annual&edition=starter

       //herseferinde numaralar farklı....assertyapma

        //driver.close();

        driver.switchTo().window(sayfaId);
        driver.findElement(By.xpath("//span[text()='Appointment scheduled']")).click();
        driver.findElement(By.xpath("(//span[text()='Decision Maker Bought-In'])[2]")).click();


        driver.findElement(By.cssSelector("#uiabstractdropdown-button-37>*>*")).click();
        driver.findElement(By.xpath("//span[text()='Existing Business']")).click();

        driver.findElement(By.xpath("//span[text()='Create']")).click();

        Thread.sleep(10000);
        //açılan sayfada kaleme tıkladık.
        driver.findElement(By.xpath("(//span[@class='UIIcon__IconContent-sc-1ngbkfp-0 bVjkIp'])[1]")).click();

        WebElement yeniisim= driver.findElement(By.xpath("(//input[starts-with(@id,'UIFormControl')])[1]"));
        yeniisim.clear();
        yeniisim.sendKeys("Veli");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='uiButton private-button private-button--tertiary private-button--sm private-button--non-link']/*"));
        //i18n-string[text()='Save']

        Thread.sleep(3000);
        WebElement yeniisimText=driver.findElement(By.xpath("//h3[@class='m-bottom-0']/*/*"));
        String isim=yeniisimText.getText();

       // Assert.assertEquals(isim,"Veli");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='private-dropdown__button-label uiDropdown__buttonLabel'])[1]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//i18n-string[text()='Delete']"));//div[starts-with(@id,'dropdown-menu')]/*/*[8]/*/*  //div[starts-with(@id,'dropdown-menu')]/*/*[8]/*/*
        Thread.sleep(3000);
        //delete deal
        driver.findElement(By.xpath("//i18n-string[text()='Delete deal']")).click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://app.hubspot.com/contacts/8446011/deals/board/view/all/"); //i18n-string[text()='Delete deal']
       //     (//div[@class='UIFlex__StyledFlex-sc-16apios-0 dvTzlS private-flex UIButtonWrapper__FlexContainer-j5mkx1-0 WGaSq']/*)[1]















    }
}
