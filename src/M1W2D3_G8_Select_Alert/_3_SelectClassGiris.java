package M1W2D3_G8_Select_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;
    /*
            select  class ı
            görünen text ile seçim:  selectByVisibleText
            value si ile seçim    :  selectByValue
            indexi ile seçim      :  selectByIndex

            seçim yaptırılabilir.

            WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

            Select menu = new Select(dropDownMenu);

            menu.selectByVisibleText("Automotive");
            menu.selectByValue("search-alias=automotive-intl-ship");
            menu.selectByIndex(2); // YAZILI OLMASI GEREKMEZ... 0 dan başlayarak kendin say...
     */

    /*
      Senaryo :
      1- https://www.amazon.com/ sitesine gidin.
      2- "Books" i seçin
      3- Arama butpnuna tıklatarak sonuçları gösterin.

     */

public class _3_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.amazon.com/ ");
        driver.manage().window().maximize();

        WebElement dropDownMenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select slc=new Select(dropDownMenu);

        slc.selectByVisibleText("Books");

        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();









Thread.sleep(Long.parseLong("300000"));
driver.quit();

    }
}
