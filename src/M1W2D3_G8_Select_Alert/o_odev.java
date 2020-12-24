package M1W2D3_G8_Select_Alert;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseStaticDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class o_odev extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://form.jotform.com/202426526543351");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        driver.manage().window().maximize();

        driver.findElement(By.name("q3_isimsoyisim[first]")).sendKeys("Mustafa");
        driver.findElement(By.id("last_3")).sendKeys("Aydın");
        driver.findElement(By.cssSelector("input#input_8_area")).sendKeys("+1");
        driver.findElement(By.id("input_8_phone")).sendKeys("2345678965");
        driver.findElement(By.name("q9_email9")).sendKeys("mstf@gmail.com");

        List<WebElement> clsmSaatleri=driver.findElements(By.name("q11_neZaman"));
        for(WebElement  saatler: clsmSaatleri){
            saatler.click();
            Thread.sleep(500);
        }

            driver.findElement(By.cssSelector("textarea#input_21")).sendKeys("5-9");
            js.executeScript("window.scrollBy(0,600)");


            List <WebElement> hobby=driver.findElements(By.xpath("//div[@id='cid_14']/*/*"));

        ArrayList<String > hobbies=new ArrayList<>(); // List de bir arryList neden bunu da yaptım ki.???
        for (int i = 0; i <hobby.size() ; i+=2) {

            hobby.get(i).click();
            hobbies.add(hobby.get(i).getText());
            //System.out.println(hobby.get(i).getText());

        }
        System.out.println("İlgi Alanlarım: "+hobbies);
/*
        List<WebElement> hobby1=driver.findElements(By.xpath("//div[@class='form-single-column'][@aria-labelledby='label_14']"));
      ArrayList<String> cc=new ArrayList<>();
        for (int i = 0; i <hobby1.size() ; i+=2) {
          cc.add(hobby1.get(i).getText());

        }
        System.out.println(cc);


 */
       // Select  dropdown=new Select(driver.findElement(By.xpath("//input[@name='q15_ozelBir[]']")));


        List<WebElement> aa=driver.findElements(By.xpath("//input[@name='q15_ozelBir[]']"));



        int a=(int)(Math.random()*aa.size());
        aa.get(a).click();
       // System.out.println(aa.get(a).getText());  // peki bu neden olmuyor... xpath ile text  neden alamıyorum????????

       // System.out.println(aa.get(a).getCssValue("value")); // value css  değil,attribute dir. Aptal.

        js =(JavascriptExecutor) driver;

        ArrayList<String>bb=new ArrayList<>();
        for (int i = 0; i <aa.size() ; i++) {

            bb.add(aa.get(i).getAttribute("value"));
        }

        System.out.println("Özel yeteneğim: "+ bb);
        System.out.println(bb.get(a));

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@id='input_2']")).click();


        WebElement son=driver.findElement(By.xpath("//h1[@style='text-align:center;']"));
        String  sonyazi=son.getText();



        Assert.assertEquals(sonyazi,"Thank You!");





        // List<WebElement> ozelytnk=driver.findElements(By.xpath("//input[@name='q15_ozelBir[]']"));




  /*
  Select dropdown = new Select(driver.findElement(By.id("id")));

//Get all options
List<WebElement> dd = dropdown.getOptions();
int index = 0;//if list contains only one element it will take that element
if(dd.size()>1){
   //Get a random number between 1, size of dd
    random rand = new Random();
    index = rand.nextInt(dd.size()-1);
   */

















    }
}
