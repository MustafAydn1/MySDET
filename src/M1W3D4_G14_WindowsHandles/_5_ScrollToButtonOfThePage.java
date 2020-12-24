package M1W3D4_G14_WindowsHandles;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseStaticDriver;

public class _5_ScrollToButtonOfThePage extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://triplebyte.com/");

   JavascriptExecutor js=(JavascriptExecutor) driver;

   js.executeScript(("window.scrollTo(0,document.body.scrollHeight)"));
   //sayfanın sonuna kadar git.


   Thread.sleep(2000);
      //  js.executeScript(("window.scrollTo(0,-document.body.scrollHeight)"));// alttaki ile aynı işlevi var.

        js.executeScript("window.scrollTo(0,0)");

        //scrollTo --> Verilen pixele kadar git.
        //scrollBy --> Verilen Kadar ileri git.



    }
}
