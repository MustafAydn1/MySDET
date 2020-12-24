package M1W2D3_G8_Select_Alert;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;

/*
Senaryo:
        1- https://www.saucedemo.com/ sitesine gidiniz.
        2- Login olunuz.
        3- Bütün ürünlerin isimlerini bir yerde tutunuz.
        4- Bütün ürünleri sepete atınız.
        5- Sepete tıklayınız.
        6- Sepetteki ürünlerle , ilk başta aldığını ürünlerin listesi
        birebir aynı olup olmadığını kontrol ediniz.

 */
public class _2_ListelemeVeYazma extends BaseStaticDriver {
    public static void main(String[] args) {
        logIn("standard_user","secret_sauce");

 //BU KISIMDA URUN İSİMLERİNİ bİ ARRAYLİST e attık..
    List<WebElement> urunler=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

    //Array a atmadan yapmaya calış...
    ArrayList<String> ekletext=new ArrayList<>();

    for(WebElement uu: urunler){

        ekletext.add(uu.getText());

        //System.out.println(uu.getText());
    }

    //Urunleri tıklatarak karta eklettik..
 List<WebElement> ekle=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

    for(WebElement ee: ekle) {
        ee.click();

    }


        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/*/*/*")).click();


//SEPETEKİ URUNLERİ BAŞKA BİR Arrayliste attık...
 List<WebElement>  sepettekiler=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

 ArrayList<String> txtsepettekiler=new ArrayList<>();

 for(WebElement ss:sepettekiler){

     txtsepettekiler.add(ss.getText());
 }


 //ürünlerin isimleri birebir aynı mı dıye bakmak için for döngüsü kurduk...
 //get(i) lerle arraylist ten elemanları cağırıp, Assert yaptırdık...

        for (int i = 0; i <txtsepettekiler.size() ; i++) {

           // if(!txtsepettekiler.get(i).equals(ekletext.get(i)));
            //Assert.fail("Ürunlerin adları aynı degil");

         //  Assert.assertEquals("urunler eşit değil",txtsepettekiler.get(i),ekletext.get(i));
           Assert.assertEquals("urunler eşit değil",urunler.get(i).getText(),sepettekiler.get(i).getText());// olmuyor

        }



    }


    public static void logIn(String username,String password){
        driver.get("http://www.saucedemo.com/ ");
        driver.manage().window().maximize();

        WebElement isim=driver.findElement(By.xpath("//input[@id='user-name']"));
        isim.sendKeys(username);
        WebElement pswrd=driver.findElement(By.xpath("//input[@id='password']"));
        pswrd.sendKeys(password);
        WebElement clik=driver.findElement(By.xpath("//input[@id='login-button']"));
        clik.click();

    }
}






/*
public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        login("standard_user","secret_sauce");
        Thread.sleep(1000);
        List<WebElement> urunler=driver.findElements(By.className("inventory_item_name"));
        ArrayList<String> urunlistesi=new ArrayList<>();
        for (WebElement w:urunler)
        {
            urunlistesi.add(w.getText());

        }
        List<WebElement> buttonlist=driver.findElements(By.className("btn_inventory"));
        for (WebElement w:buttonlist)
        {
             w.click();
        }


        Thread.sleep(1000);
        WebElement sepet=driver.findElement(By.className("shopping_cart_badge"));
        sepet.click();
        List<WebElement> eklenenurunler=driver.findElements(By.className("inventory_item_name"));
        ArrayList<String> eklenenlermetin=new ArrayList<>();
        for (WebElement w:eklenenurunler)
        {
            System.out.println(w.getText());
        eklenenlermetin.add(w.getText());
        }
        //kontrol kodu.
        for (int i = 0; i <urunlistesi.size() ; i++) {
            if (!urunlistesi.get(i).equals(eklenenlermetin.get(i))) System.out.println(urunlistesi.get(i)+"' urunde Hata var");
        }


        Thread.sleep(1000);
        driver.quit();

    }public static void login(String username, String password) throws InterruptedException {
        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys(username);

        Thread.sleep(1000);
        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys(password);

        Thread.sleep(1000);
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }
 */