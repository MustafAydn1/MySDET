package M1W2D2_G7_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
1- https://www.saucedemo.com/ sitesini açınız.
        2- Ekranda görünen usernamleri bir string diziye atınız.
        3- Bu username ve passwordlarını hepsinin login olup olamadığını
        login olduktan sonraki sayfada Products kelimesinin kontrol ederek
        doğrulayınız.
        diğer login kontrolleri için navigate.back kullanınız.
        4- Login olamayan userları ve hata bilgisini yazdırınız.

 */
public class users_Login_findelements_ile extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.saucedemo.com/ ");
        driver.manage().window().maximize();
        //String [] kullanicilar={"standard_user","locked_out_user","problem_user","performance_glitch_user"};

        WebElement al=driver.findElement(By.xpath("//div[@id='login_credentials']"));

        String all=al.getText();
        String[] alll=all.trim().split("\n");
       String [] sonn=new String[alll.length-1];

        for (int i = 1; i <alll.length ; i++) {
            sonn[i-1]=alll[i];
        }
 //*****
/*  BURADA DİREK List yaparak  findelements ile bulunmuş.. daha güzel olmuş.  bunu da kullan. daha kısa olur.

 List< WebElement> yazi1= driver.findElements(By.xpath("//*[@id=\"login_credentials\"]"));
        String [] arr2=new String[yazi1.size()-1];
        for (WebElement e:yazi1) {
           String [] arr= (e.getText().split("\n"));
           arr2=new String[arr.length-1];
           int i;
            for (i = 1; i < arr.length ; i++) {
arr2[i-1]=arr[i];
 */

      /*
        ArrayList<String >son=new ArrayList<>();
        son.addAll(Arrays.asList(alll));
         son.remove(0);

       */
        String pswrd="secret_sauce";


        for (String users:sonn) {

            WebElement usernameinput = driver.findElement(By.xpath("//input[@id='user-name'] "));
            usernameinput.clear();
            usernameinput.sendKeys(users);
            Thread.sleep(500);

            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            password.clear();
            password.sendKeys(pswrd);
            Thread.sleep(500);

            driver.findElement(By.xpath("//input[@id='login-button']")).click();

            List<WebElement>  txtProducts=driver.findElements(By.xpath("//div[text()='Products']"));
            // list dışında da bunun cöz.

            if(txtProducts.size()==1){
                System.out.println(users +" login oldu");
                driver.navigate().back();
            }
            else
            {
                WebElement errorElement=driver.findElement(By.xpath("//h3[@data-test='error']"));
                System.out.println(users +" "+ errorElement.getText());
                System.out.println(users+ " login olamadı");

            }
            Thread.sleep(2000);
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
