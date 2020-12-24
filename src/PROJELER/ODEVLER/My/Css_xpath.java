package PROJELER.ODEVLER.My;

import utils.BaseStaticDriver;

public class Css_xpath  extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

       // driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");
        //driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();





        Thread.sleep(15000);
        driver.quit();
    }
}
