package M1W3D1_G11_MouseActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.BaseStaticDriver;

public class _3_RightClickButton extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();


        WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));

        Actions builder=new Actions(driver);

        Action build=builder.moveToElement(rightClickBtn).contextClick().build();
        build.perform();

// bastaki ve sondaki aynı build degilmiş...!!!!!!
// Action aksiyon=builder.moveToElement(rightClickBtn).contextClick().build();


        WebElement mesaj=driver.findElement(By.id("rightClickMessage"));
        mesaj.getText();

        Assert.assertEquals("Hatalı","You have done a right click",mesaj.getText());
    }
}

//builder.contextClick(rightClickButton).perform();
//hocam bu sekilde move a gitmeden de olabiliyor

//        Action aksyn=builder.contextClick(rightClickBtn).perform();  DENEDİM OLMADI???