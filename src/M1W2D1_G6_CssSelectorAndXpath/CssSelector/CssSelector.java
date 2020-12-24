package M1W2D1_G6_CssSelectorAndXpath.CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

/*1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
        2- Business i çekleyin.
        3- discover XYZ ye tıklatın ve online Advertising i seçin
        4- Every day i seçin
        5- Good u seçin
        6- using XYZ yi tıklatın ve 3.seçeneği seçin

 */
public class CssSelector extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

driver.findElement(By.cssSelector("input[id$='4586_0']")).click();
// DİKKAT:İD LERİN BAŞ KISIMLARI AYNI,BU TESTİ ENGELLEMEK İÇİNDİR.bU YUZDEN  *,^,$  İŞARETLERİ İLE İÇİNDE BİR KISIMLA İLERLE....
// sabah denedim çalışmadı adam aynı olan kısımları değişrtiriyor.

driver.findElement(By.cssSelector("select[id*='_4588']>:nth-of-type(4)")).click();  //option[value='Online Advertising']
// bu kısmı Select states=new Select(driver.findElement(By.id("id_state")));
//    states.selectByValue("1");  benzeri  Select ile  de yapabilirdik...C:\Users\CASPER\IdeaProjects\SeleniumMentoring\src\BURAK_BY\Giris\Form.java


driver.findElement(By.cssSelector("input[id$='9585_0']")).click(); // input[value='Every Day']

driver.findElement(By.cssSelector("input[value='Good']")).click();


        WebElement xyz= driver.findElement(By.cssSelector("select[name*='4597']"));
        Select anla=new Select(xyz);
        anla.getOptions(); // bunu yaptıgında direk Select classda list oluştu.
        //int rand=(int)(Math.random()*anla.getOptions().size());
/*bu haliyle "select an option"-->>index=0,ve sonuncu da yani;012345 den, indexi 5 olan, sırası 6. olan  da geldi..
Öyleyse .getOptions lar saymaya 1 den başlıyor. böylece 6 ya kadar geliyor. randoma  +1 yazmayınca da,
0 dan 5 e kadar secer... Evet öyle yapıyor ve hepsini de seçiyor...

Yani::: .getOption 1 den balayarak sıralıyor.
selectByIndex() ise 0 dan başlayarak yerleştiriyor.

 */


        int rand=(int)(Math.random()*anla.getOptions().size()+1);
//+1 li haliylede  int rand=6 olunca hata verdi.Devam etmedi. bunu nasıl çözeriz.
// int random  hem 0. yı secmesin, hemde 5 i gecmesin. Bunu düşün ve çöz...

        System.out.println(rand);

        anla.selectByIndex(rand);




driver.findElement(By.name("u_Llc_89597")).sendKeys("ne var ne yok...");
driver.findElement(By.id("u_Llc_14597")).sendKeys("11.01.1999");

        WebElement ulke=driver.findElement(By.xpath("(//select[starts-with(@name,'u_Llc')])[3]"));
        Select slc=new Select(ulke);
        slc.getOptions();
        int random=(int)(Math.random()*slc.getOptions().size()+2);

        slc.selectByIndex(random);



Thread.sleep(5000);
driver.quit();

    }
}
