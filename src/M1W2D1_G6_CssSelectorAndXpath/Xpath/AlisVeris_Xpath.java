package M1W2D1_G6_CssSelectorAndXpath.Xpath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;
/*
1- https://www.saucedemo.com/  sitesini açın
        2- login işlemini yapınız.   //input[@id='password']   //input[@id='user-name']   //input[@id='login-button']
        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
        4- Sonra geri dönün
        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
        6- sepete tıklatın
        7- CheckOut a tıklatın
        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
        9- Burada her bir eşyanın ücretlerinin toplamının
        aşağıdaki Item total e eşit olup olmadığını Assert ile test
        ediniz.

 */
public class AlisVeris_Xpath extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

 driver.get("http://www.saucedemo.com/ ");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='user-name'] ")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
      //driver.findElement(By.linkText("Sauce Labs Backpack")).click(); //a olmasaydı, bulamazdın.Xpath tumunde.
        driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"ADD TO CART\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"<- Back\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()=\"Sauce Labs Bolt T-Shirt\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()=\"ADD TO CART\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click(); // div idi.sildim.* yazdım.oldu.herhangi bir...

        driver.findElement(By.xpath("//a[@class=\"btn_action checkout_button\"]")).click();
        driver.findElement(By.xpath("//input[@autocapitalize=\"none\"][@data-test=\"firstName\"]")).sendKeys("Mustafa");
        driver.findElement(By.xpath("//div[@class=\"checkout_info_wrapper\"]/*/*/*[2]")).sendKeys("Aydin");
        driver.findElement(By.xpath("//div[@class=\"checkout_buttons\"]/parent::*/div/input[3]")).sendKeys("36789");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

       WebElement birincifiyat= driver.findElement(By.xpath("//div[@class='cart_item_label']/*[3]"));

       String txtfiyat1=birincifiyat.getText();


       WebElement ikincifiyat= driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));

       String txtfiyat2= ikincifiyat.getText();


        String itemTotal=driver.findElement(By.xpath("//div[@class=\"summary_info\"]/*[5]")).getText();

           System.out.println(txtfiyat1);
           System.out.println(txtfiyat2);
           System.out.println(itemTotal);

          double urunfiyattoplam=stringToDouble(txtfiyat1) + stringToDouble(txtfiyat2);
        System.out.println(urunfiyattoplam);

          double toplam=stringToDouble(itemTotal);
        System.out.println(toplam);

          Assert.assertTrue(toplam==urunfiyattoplam);

        //  Assert.assertEquals("toplam","urunfiyattoplam");
//Assert.assertEquals(toplam,urunfiyattoplam,0);
//double da farkli biraz direk esitlemiyor, hata payi istiyor...
           //yani sayı olursa  == ile mi yapacagız



    //    Assert.assertEquals("Item total: $45.98",itemTotal);

      //  driver.findElement(By.xpath("//a[@href='./checkout-complete.html']")).click();

        Thread.sleep(6000);
      //  driver.quit();


    }   //ARTIK BUNU HERYERDEN ÇAGIR.....

         public static double stringToDouble(String strTutar){

                double tutar=0;
                String  duzeltilmisHali=strTutar.replaceAll("[^\\d.]","");

                return Double.parseDouble(duzeltilmisHali);

           }






}
// hocam , ilk girişte  Kullanın dediği usernames den 4 unden  2 si ile sendKeys den girilince hatalı sonuçlar veriyor.
// locked_out_user
//problem_user


/*
double cantafiyat = Double.parseDouble(driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]")).getText().replaceAll("[^0-9]", ""));
       double thirtfiyat = Double.parseDouble(driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]")).getText().replaceAll("[^0-9]", ""));
        double itemtotal = Double.parseDouble(driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText().replaceAll("[^0-9]", ""));
       double toplam = cantafiyat + thirtfiyat;
        Assert.assertEquals(itemtotal,toplam);
        driver.quit();
 */